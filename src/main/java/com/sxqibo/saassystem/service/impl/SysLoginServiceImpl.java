package com.sxqibo.saassystem.service.impl;

import com.sxqibo.saassystem.common.constant.Constants;
import com.sxqibo.saassystem.common.core.exception.BaseException;
import com.sxqibo.saassystem.common.core.exception.CaptchaNotMatchException;
import com.sxqibo.saassystem.common.core.exception.UserPasswordNotMatchException;
import com.sxqibo.saassystem.common.util.RedisCache;
import com.sxqibo.saassystem.entity.LoginUser;
import com.sxqibo.saassystem.service.ISysLoginService;
import com.sxqibo.saassystem.service.ITokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class SysLoginServiceImpl implements ISysLoginService
{
    @Autowired
    private RedisCache redisCache;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private ITokenService tokenService;

    /**
     * 带验证码登录
     * @param username
     * @param password
     * @param code
     * @param uuid
     * @return
     */
    @Override
    public String login(String username, String password, String code, String uuid)
    {
        // 1.从redis中获取验证码判断是否正确
//        String key = Constants.CAPTCHA_CODE_KEY + uuid;
//        String captcha = redisCache.getCacheObject(key);
//        redisCache.deleteObject(key);
//
//        if (!code.equalsIgnoreCase(captcha)) {
//            throw new CaptchaNotMatchException();
//        }

        // 2.用户认证
        Authentication authenticate = null;
        try {
            authenticate = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(username, password));
        } catch (Exception e) {
            throw new UserPasswordNotMatchException();
        }

        // 3.获取用户经过身份验证的用户的主体信息
        LoginUser loginUser = (LoginUser)authenticate.getPrincipal();

        // 4.创建token

        return tokenService.createToken(loginUser);
    }
}
