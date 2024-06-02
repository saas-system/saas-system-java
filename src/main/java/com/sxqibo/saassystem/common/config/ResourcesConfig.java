package com.sxqibo.saassystem.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Collections;

/**
 * 通用的配置
 */
@Configuration
public class ResourcesConfig
{
    @Bean
    public CorsFilter corsFilter()
    {
        CorsConfiguration config = new CorsConfiguration();

        // 允许凭证
        config.setAllowCredentials(true);
        // 设置访问源地址
        config.setAllowedOriginPatterns(Collections.singletonList(CorsConfiguration.ALL));
        // 设置访问源请求头
        config.addAllowedHeader(CorsConfiguration.ALL);
        // 设置访问源请求方法
        config.addAllowedMethod(CorsConfiguration.ALL);

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        // 对接口配置跨域设置
        source.registerCorsConfiguration("/**", config);

        return new CorsFilter(source);
    }
}
