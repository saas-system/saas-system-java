package com.sxqibo.saassystem.controller.tenant;


import com.sxqibo.saassystem.common.core.domain.BaseResponse;
import com.sxqibo.saassystem.common.util.ServletUtils;
import com.sxqibo.saassystem.dto.admin.AdminLoginDTO;
import com.sxqibo.saassystem.entity.LoginUser;
import com.sxqibo.saassystem.entity.tenant.TenantAdmin;
import com.sxqibo.saassystem.service.ISysLoginService;
import com.sxqibo.saassystem.service.ISysPermissionService;
import com.sxqibo.saassystem.service.ITokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * <p>
 * 租户 - 管理员表 前端控制器
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
@RestController
@RequestMapping("/tenant/index")
public class TenantAdminController
{
    @Autowired
    private ISysLoginService sysLoginService;

    @Autowired
    private ISysPermissionService sysPermissionService;

    @Autowired
    private ITokenService tokenService;

    @PostMapping("login")
    public BaseResponse login(@RequestBody AdminLoginDTO requestBody)
    {
        // 生成令牌
        String token = sysLoginService.login(requestBody.getUsername() + "@tenant", requestBody.getPassword(),
                requestBody.getCaptchaId(), requestBody.getCaptchaInfo());

        return BaseResponse.success(token);
    }

    @GetMapping("getInfo")
    public BaseResponse getInfo()
    {
        LoginUser loginUser = tokenService.getLoginUser(ServletUtils.getRequest());
        TenantAdmin tenantAdmin = loginUser.getTenantAdmin();

        Set<String> groupRule = sysPermissionService.getGroupRule(tenantAdmin);

        Set<String> menu = sysPermissionService.getMenu(tenantAdmin);

        Map<String, Object> map = new HashMap<>();
        map.put("user", tenantAdmin);
        map.put("group", groupRule);
        map.put("menu", menu);

        return BaseResponse.success(map);
    }
}
