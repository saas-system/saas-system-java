package com.sxqibo.saassystem.common.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SecurityUtils
{
    /**
     * 生成BCryptPasswordEncoder密码
     *
     * @param password 密码
     * @param salt 盐值
     * @return 加密字符串
     */
    public static String encryptPassword(String password,String salt)
    {
        return md5Encode(md5Encode(password) + salt);
    }

    /**
     * 判断密码是否相同
     *
     * @param rawPassword     真实密码
     * @param encodedPassword 加密后字符
     * @param salt 盐值
     * @return 结果
     */
    public static boolean matchesPassword(String rawPassword, String encodedPassword, String salt)
    {
        String s = encryptPassword(rawPassword, salt);
        return s.toLowerCase().equals(encodedPassword.toLowerCase());
    }

    public static String md5Encode(String source) {
        try {
            // 创建一个MessageDigest实例，指定为MD5算法
            MessageDigest md = MessageDigest.getInstance("MD5");

            // 将原始字符串转换为字节数组
            byte[] srcBytes = source.getBytes();

            // 更新摘要，将字节数组传入
            md.update(srcBytes);

            // 完成哈希计算，得到字节数组
            byte[] digestBytes = md.digest();

            // 可选：将字节数组转换为16进制字符串表示
            StringBuilder hexString = new StringBuilder();
            for (byte b : digestBytes) {
                hexString.append(String.format("%02x", b));
            }
            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("MD5 algorithm not found", e);
        }
    }

    public static void main(String[] args)
    {
        System.out.println(md5Encode("123456"));
    }
}
