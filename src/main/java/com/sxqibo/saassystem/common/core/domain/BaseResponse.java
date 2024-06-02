package com.sxqibo.saassystem.common.core.domain;

import java.io.Serializable;

public class BaseResponse<T> implements Serializable
{
    private static final long serialVersionUID = 1L;

    private Integer code;
    private String msg;
    private T data;
    private Long time;

    private boolean success;

    public boolean isSuccess()
    {
        return success;
    }

    public void setSuccess(boolean success)
    {
        this.success = success;
    }

    public static <T> BaseResponse<T> success(T data)
    {
        BaseResponse<T> response = new BaseResponse<T>();

        response.setCode(ResultCode.SUCCESS.getCode());
        response.setMsg(ResultCode.SUCCESS.getMsg());
        response.setData(data);
        response.setSuccess(true);

        return response;
    }

    public static <T> BaseResponse<T> fail(String message)
    {
        BaseResponse<T> response = new BaseResponse<T>();

        response.setCode(ResultCode.SUCCESS.getCode());
        response.setMsg(message);
        response.setSuccess(false);

        return response;
    }

    public static <T> BaseResponse<T> fail(Integer code, String message)
    {
        BaseResponse<T> response = new BaseResponse<T>();

        response.setCode(code);
        response.setMsg(message);
        response.setSuccess(false);

        return response;
    }

    public static <T> BaseResponse<T> fail(Integer code, String message, boolean success)
    {
        BaseResponse<T> response = new BaseResponse<T>();

        response.setCode(code);
        response.setMsg(message);
        response.setSuccess(success);

        return response;
    }

    public void setCode(Integer code)
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

    public Integer getCode()
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
