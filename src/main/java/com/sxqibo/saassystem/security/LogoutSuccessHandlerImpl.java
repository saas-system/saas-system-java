package com.sxqibo.saassystem.security;

import com.alibaba.fastjson.JSON;
import com.sxqibo.saassystem.common.core.domain.BaseResponse;
import com.sxqibo.saassystem.common.util.ServletUtils;
import com.sxqibo.saassystem.entity.LoginUser;
import com.sxqibo.saassystem.service.ITokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

import java.io.IOException;
import java.util.Objects;

/**
 * 自定义退出登录处理器
 */
@Configuration
public class LogoutSuccessHandlerImpl implements LogoutSuccessHandler
{
    @Autowired
    private ITokenService tokenService;

    @Override
    public void onLogoutSuccess(jakarta.servlet.http.HttpServletRequest request,
                                jakarta.servlet.http.HttpServletResponse response,
                                Authentication authentication)
            throws IOException, jakarta.servlet.ServletException
    {
        LoginUser loginUser = tokenService.getLoginUser(request);
        if(!Objects.isNull(loginUser)) {
            String token = loginUser.getToken();
            //删除用户缓存数据
            tokenService.delLoginUser(token);
        }

        ServletUtils.renderString(response,
                JSON.toJSONString(BaseResponse.success("退出成功")));
    }
}
