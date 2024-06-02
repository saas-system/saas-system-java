package com.sxqibo.saassystem.common.core.exception;

/**
 * 自定义验证码异常
 **/
public class CaptchaNotMatchException extends CustomException
{
    public CaptchaNotMatchException()
    {
        super(400, "验证码错误");
    }
}
