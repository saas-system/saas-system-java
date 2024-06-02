package com.sxqibo.saassystem.common.config;

import com.sxqibo.saassystem.filter.JwtAuthenticationTokenFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.LogoutConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.logout.LogoutFilter;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.security.web.util.matcher.OrRequestMatcher;
import org.springframework.web.filter.CorsFilter;

/**
 * Security配置
 **/
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true)
@Configuration
@EnableWebSecurity
public class SecurityConfig
{
    /**
     * 认证失败处理器
     */
    @Autowired
    private AuthenticationEntryPoint unauthorizedHandler;

    @Autowired
    private JwtAuthenticationTokenFilter jwtAuthenticationTokenFilter;

    @Autowired
    private LogoutSuccessHandler logoutSuccessHandler;

    @Autowired
    private CorsFilter corsFilter;

    /**
     * 配置密码加密方式
     */
    @Bean
    public PasswordEncoder passwordEncoder()
    {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http)
            throws Exception
    {
        http.authorizeHttpRequests((reqeusts) -> reqeusts
                        // 对于登录login 验证码captchaImage 允许匿名访问
                    .requestMatchers("/admin/index/login", "/captchaImage", "/tenant/index/login").permitAll()
                        // 除上面外的所有请求全部需要鉴权认证
                    .anyRequest().authenticated()
                )
                .logout(LogoutConfigurer::permitAll)
                .exceptionHandling(exceptions->
                        //认证失败处理器
                        exceptions.authenticationEntryPoint(unauthorizedHandler)
                )
                // CSRF禁用，因为不使用session
                .csrf(AbstractHttpConfigurer::disable)
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                // 添加JWTFilter
                .addFilterBefore(jwtAuthenticationTokenFilter, UsernamePasswordAuthenticationFilter.class)
                // 添加 CORS Filter
                .addFilterBefore(corsFilter, JwtAuthenticationTokenFilter.class)
                // 确保在用户注销时，响应头依然包含跨域字段
                .addFilterBefore(corsFilter, LogoutFilter.class)
                .logout((logout) -> logout
                        .logoutRequestMatcher(new OrRequestMatcher(
                                new AntPathRequestMatcher("/admin/index/logout", "POST"),
                                new AntPathRequestMatcher("/tenant/index/logout", "POST")
                        ))
                        .logoutSuccessHandler(logoutSuccessHandler)
                );

        return http.build();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration)
            throws Exception
    {
        return authenticationConfiguration.getAuthenticationManager();
    }

}
