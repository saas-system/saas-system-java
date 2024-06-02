package com.sxqibo.saassystem.common.enums;

/**
 * 用户状态
 */
public enum UserStatus
{
    ENABLE("1", "正常"),
    DISABLE("0", "停用");

    private final String code;
    private final String info;

    UserStatus(String code, String info)
    {
        this.code = code;
        this.info = info;
    }

    public String getCode()
    {
        return code;
    }

    public String getInfo()
    {
        return info;
    }
}
