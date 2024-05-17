package com.sxqibo.saassystem.common.core.domain;

/**
 * 响应状态码
 */
public enum ResultCode
{
    SUCCESS("200", "操作成功"),
    ERROR("500", "操作失败");

    private final String code;
    private final String msg;

    ResultCode(String code, String msg)
    {
        this.code = code;
        this.msg = msg;
    }

    public String getCode()
    {
        return code;
    }

    public String getMsg()
    {
        return msg;
    }
}
