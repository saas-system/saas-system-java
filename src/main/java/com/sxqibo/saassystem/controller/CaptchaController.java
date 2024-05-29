package com.sxqibo.saassystem.controller;


import com.sxqibo.saassystem.common.constant.Constants;
import com.sxqibo.saassystem.common.util.ChainedMap;
import com.sxqibo.saassystem.common.util.RedisCache;
import com.sxqibo.saassystem.common.util.UUIDUtils;
import com.wf.captcha.SpecCaptcha;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;

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
    public ChainedMap getCode(HttpServletResponse response)
    {
        SpecCaptcha specCaptcha = new SpecCaptcha(130, 48, 4);

        // 生成验证码，以及验证码的唯一标识
        String uuid = UUIDUtils.simpleUUID();

        // 拼接redis的key
        String key = Constants.CAPTCHA_CODE_KEY + uuid;
        String code = specCaptcha.text().toLowerCase();

        // 保存到redis
        redisTemplate.opsForValue().set(key, code, Duration.ofMinutes(10));

        return ChainedMap.create().set("uuid", uuid).set("img", specCaptcha.toBase64());
    }
}
