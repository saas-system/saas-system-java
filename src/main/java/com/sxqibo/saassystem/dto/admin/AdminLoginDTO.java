package com.sxqibo.saassystem.dto.admin;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;


/**
 * 平台端登录请求
 */
@Data
public class AdminLoginDTO
{
    @NotBlank(message = "账号不能为空")
    private String username;

    @NotBlank(message = "账号不能为空")
    private String password;

    private Boolean keep;

    private String captchaId;

    private String captchaInfo;
}
