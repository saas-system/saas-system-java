package com.sxqibo.saassystem.common.core.domain;

/**
 * 响应状态码
 */
public enum ResultCode
{
    SUCCESS(200, "操作成功"),
    ERROR(500, "操作失败");

    /**
     * 状态码
     */
    private final Integer code;

    /**
     * 描述
     */
    private final String msg;

    ResultCode(Integer code, String msg)
    {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode()
    {
        return code;
    }

    public String getMsg()
    {
        return msg;
    }
}
