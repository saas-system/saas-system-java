package com.sxqibo.saassystem.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sxqibo.saassystem.entity.LoginUser;
import com.sxqibo.saassystem.entity.Token;
import jakarta.servlet.http.HttpServletRequest;

/**
 * <p>
 * 用户Token表 服务类
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
public interface ITokenService extends IService<Token>
{

    /**
     * 创建令牌
     * @param loginUser
     * @return
     */
    String createToken(LoginUser loginUser);

    /**
     * 缓存用户信息&刷新令牌有效期
     */
    void refreshToken(LoginUser loginUser);

    /**
     * 获取用户信息
     * @param request
     * @return
     */
    LoginUser getLoginUser(HttpServletRequest request);

    /**
     * 验证令牌的有效期，并刷新缓存
     * @param loginUser
     */
    void verifyToken(LoginUser loginUser);

    /**
     * 设置用户身份信息
     * @param loginUser
     */
    void setLoginUser(LoginUser loginUser);

    /**
     * 删除用户
     * @param token
     */
    void deleteLoginUser(String token);

    void delLoginUser(String token);
}
