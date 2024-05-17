package com.sxqibo.saassystem.common.core.domain;

import java.io.Serializable;

public class BaseResponse<T> implements Serializable
{
    private static final long serialVersionUID = 1L;

    private String code;
    private String msg;
    private T data;
    private Long time;

    public static <T> BaseResponse<T> success(T data)
    {
        BaseResponse<T> response = new BaseResponse<T>();

        response.setCode(ResultCode.SUCCESS.getCode());
        response.setMsg(ResultCode.SUCCESS.getMsg());
        response.setData(data);

        return response;
    }

    public static <T> BaseResponse<T> fail(String message)
    {
        BaseResponse<T> response = new BaseResponse<T>();

        response.setCode(ResultCode.SUCCESS.getCode());
        response.setMsg(message);

        return response;
    }

    public static <T> BaseResponse<T> fail(String code, String message)
    {
        BaseResponse<T> response = new BaseResponse<T>();

        response.setCode(code);
        response.setMsg(message);

        return response;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }

    public void setData(T data)
    {
        this.data = data;
    }

    public void setTime(Long time)
    {
        this.time = time;
    }

    public String getCode()
    {
        return code;
    }

    public String getMsg()
    {
        return msg;
    }

    public T getData()
    {
        return data;
    }

    public Long getTime()
    {
        return time;
    }
}
