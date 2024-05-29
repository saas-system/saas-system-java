package com.sxqibo.saassystem.service.impl;

import com.sxqibo.saassystem.common.constant.Constants;
import com.sxqibo.saassystem.common.util.RedisCache;
import com.sxqibo.saassystem.common.util.UUIDUtils;
import com.sxqibo.saassystem.entity.LoginUser;
import com.sxqibo.saassystem.entity.Token;
import com.sxqibo.saassystem.mapper.TokenMapper;
import com.sxqibo.saassystem.service.ITokenService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/**
 * <p>
 * 用户Token表 服务实现类
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
@Service
public class TokenServiceImpl
        extends ServiceImpl<TokenMapper, Token>
        implements ITokenService
{
    @Autowired
    private RedisCache redisCache;

    @Value("${token.header}")
    private String header;
    @Value("${token.secret}")
    private String secret;

    @Value("${token.expireTime}")
    private Integer expireTime;

    private static final Long MILLIS_SECOND = 1000L;
    private static final Long MILLIS_MINUTE = MILLIS_SECOND * 60;
    private static final Long MILLIS_MINUTE_TEN = MILLIS_SECOND * 60 * 20;

    /**
     * 创建令牌
     * @param loginUser
     * @return
     */
    @Override
    public String createToken(LoginUser loginUser)
    {
        // 设置用户的唯一标识
        String userKey = UUIDUtils.randomUUID();
        loginUser.setToken(userKey);

        // 保存用户信息，刷新令牌
        refreshToken(loginUser);

        Map<String, Object> claims = new HashMap<>();
        claims.put(Constants.LOGIN_USER_KEY, userKey);
        return Jwts.builder()
                .setClaims(claims)
                .signWith(SignatureAlgorithm.HS256, secret)
                .compact();
    }

    @Override
    public void refreshToken(LoginUser loginUser)
    {
        loginUser.setLoginTime(System.currentTimeMillis());
        // 过期时间是30分钟
        loginUser.setExpireTime(loginUser.getLoginTime() + expireTime * MILLIS_MINUTE);
        // 根据UUID将loginUser缓存
        String userKey = getTokenKey(loginUser.getToken());

        redisCache.setCacheObject(userKey, loginUser, expireTime, TimeUnit.MINUTES);
    }

    @Override
    public LoginUser getLoginUser(HttpServletRequest request)
    {
        String token = getToken(request);

        if (!StringUtils.isEmpty(token)) {
            Claims claims = parseToken(token);
            // 解析对应的用户信息
            String uuid = (String)claims.get(Constants.LOGIN_USER_KEY);
            String userKey = getTokenKey(uuid);

            return redisCache.getCacheObject(userKey);
        }

        return null;
    }

    @Override
    public void verifyToken(LoginUser loginUser)
    {
        Long expireTime = loginUser.getExpireTime();
        long currentTimeMillis = System.currentTimeMillis();

        // 相差不足20分钟，刷新缓存
        if (expireTime - currentTimeMillis <= MILLIS_MINUTE_TEN) {
            refreshToken(loginUser);
        }
    }

    @Override
    public void setLoginUser(LoginUser loginUser)
    {
        if (!Objects.isNull(loginUser)
                && !StringUtils.isEmpty(loginUser.getToken())) {
            refreshToken(loginUser);
        }
    }

    @Override
    public void deleteLoginUser(String token)
    {
        if (!Objects.isNull(token)) {
            String userKey = getTokenKey(token);
            redisCache.deleteObject(userKey);
        }
    }

    /**
     * 从令牌中获取数据的声明
     *
     * @param token
     * @return
     */
    private Claims parseToken(String token)
    {
        return Jwts.parser().setSigningKey(secret)
                .parseClaimsJws(token)
                .getBody();
    }

    /**
     * 拼接tokenKey
     */
    private String getTokenKey(String uuid)
    {
        return Constants.LOGIN_TOKEN_KEY + uuid;
    }

    /**
     * 从请求头中获取token
     * @param request
     * @return
     */
    private String getToken(HttpServletRequest request)
    {
        String token = request.getHeader(header);

        // JWT Authorization: Bearer xxxxx
        if (!StringUtils.isEmpty(token)
                && token.startsWith(Constants.TOKEN_PREFIX)) {
            token = token.replace(Constants.TOKEN_PREFIX, "");
        }

        return token;
    }
}
