package com.sxqibo.saassystem.common.core.exception;

import jakarta.servlet.http.HttpServletResponse;
import org.apache.poi.ss.formula.functions.T;

public class CustomException extends RuntimeException
{
    private Integer code;

    private String msg;

    private T data;

    private boolean success;

    public CustomException()
    {
    }

    public CustomException(Integer code, String msg)
    {
        this.code = code;
        this.msg = msg;
        this.success = HttpServletResponse.SC_OK == code;
    }

    public CustomException(Integer code, String msg, boolean success)
    {
        this.code = code;
        this.msg = msg;
        this.success = success;
    }

    public CustomException(Integer code, String msg, T data, boolean success)
    {
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.success = success;
    }

    public Integer getCode()
    {
        return code;
    }

    public void setCode(Integer code)
    {
        this.code = code;
    }

    public String getMsg()
    {
        return msg;
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }

    public T getData()
    {
        return data;
    }

    public void setData(T data)
    {
        this.data = data;
    }

    public boolean isSuccess()
    {
        return success;
    }

    public void setSuccess(boolean success)
    {
        this.success = success;
    }
}
