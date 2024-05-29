package com.sxqibo.saassystem.common.core.exception;

public class UserPasswordNotMatchException extends CustomException
{
    public UserPasswordNotMatchException()
    {
        super(400, "用户不存在或密码错误");
    }
}
