package com.sxqibo.saassystem.controller;


import com.sxqibo.saassystem.common.constant.Constants;
import com.sxqibo.saassystem.common.core.domain.BaseResponse;
import com.sxqibo.saassystem.common.util.UUIDUtils;
import com.wf.captcha.SpecCaptcha;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

/**
 * 获取验证码
 *
 * @author JiYun
 * @since 2024-05-15
 */
@RestController
public class CaptchaController
{
    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping("/captchaImage")
    public BaseResponse getCode(HttpServletResponse response)
    {
        SpecCaptcha specCaptcha = new SpecCaptcha(130, 48, 4);

        // 生成验证码，以及验证码的唯一标识
        String uuid = UUIDUtils.simpleUuid();

        // 拼接redis的key
        String key = Constants.CAPTCHA_CODE_KEY + uuid;
        String code = specCaptcha.text().toLowerCase();

        // 保存到redis
        redisTemplate.opsForValue().set(key, code, Duration.ofMinutes(10));

        Map<String, Object> map = new HashMap<>();
        map.put("uuid", uuid);
        map.put("img", specCaptcha.toBase64());

        return BaseResponse.success(map);
    }
}
