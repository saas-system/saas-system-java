package com.sxqibo.saassystem.security;

import com.alibaba.fastjson.JSON;
import com.sxqibo.saassystem.common.constant.HttpStatus;
import com.sxqibo.saassystem.common.core.domain.BaseResponse;
import com.sxqibo.saassystem.common.util.ServletUtils;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * 自定义认证失败处理器
 */
@Component
public class AuthenticationEntryPointImpl implements AuthenticationEntryPoint
{
    @Override
    public void commence(HttpServletRequest request,
                         HttpServletResponse response,
                         AuthenticationException authException)
            throws IOException, ServletException
    {
        int code = HttpStatus.UNAUTHORIZED;

        String json = JSON.toJSONString(
                BaseResponse.fail(code, "认证失败，无法访问系统资源"));

        ServletUtils.renderString(response, json);
    }
}
