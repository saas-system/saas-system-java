package com.sxqibo.saassystem.common.util;

import java.util.UUID;

/**
 * UUID生成器工具类
 **/
public class UUIDUtils
{
    /**
     * 获取随机UUID
     *
     * @return 随机UUID
     */
    public static String randomUuid()
    {
        return UUID.randomUUID().toString();
    }

    /**
     * 简化的UUID，去掉了横线
     *
     * @return 简化的UUID，去掉了横线
     */
    public static String simpleUuid()
    {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
