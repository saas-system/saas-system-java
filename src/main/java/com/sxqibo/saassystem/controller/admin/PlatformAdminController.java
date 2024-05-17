package com.sxqibo.saassystem.controller.admin;


import com.sxqibo.saassystem.common.core.domain.BaseResponse;
import com.sxqibo.saassystem.common.core.exception.BaseException;
import com.sxqibo.saassystem.dto.admin.AdminLoginDTO;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * <p>
 * 平台 - 管理员表 前端控制器
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
@RestController
@RequestMapping("/admin/index")
public class PlatformAdminController
{
    @PostMapping("login")
    public BaseResponse<AdminLoginDTO> login(@RequestBody AdminLoginDTO requestBody)
    {
        return BaseResponse.success(requestBody);
    }

    @PostMapping("login1")
    public BaseResponse<AdminLoginDTO> login1(@RequestBody @Validated AdminLoginDTO requestBody)
    {
        return BaseResponse.success(requestBody);
    }
    @GetMapping("queryQuery")
    public BaseResponse queryQuery()
    {
        throw new BaseException("500", "测试异常类");
    }
}
