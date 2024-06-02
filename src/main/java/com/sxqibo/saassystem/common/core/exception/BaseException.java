package com.sxqibo.saassystem.common.core.exception;

public class BaseException extends RuntimeException
{
    private String code;

    private String message;

    public BaseException()
    {
    }

    public BaseException(String message)
    {
        this.message = message;
    }

    public BaseException(String code, String message)
    {
        super(message);
        this.code = code;
        this.message = message;
    }

    public String getCode()
    {
        return code;
    }

    public String getMessage()
    {
        return message;
    }
}
