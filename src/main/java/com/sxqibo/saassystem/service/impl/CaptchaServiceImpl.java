package com.sxqibo.saassystem.service.impl;

import com.sxqibo.saassystem.entity.Captcha;
import com.sxqibo.saassystem.mapper.CaptchaMapper;
import com.sxqibo.saassystem.service.ICaptchaService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 验证码表 服务实现类
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
@Service
public class CaptchaServiceImpl extends ServiceImpl<CaptchaMapper, Captcha> implements ICaptchaService {

}
