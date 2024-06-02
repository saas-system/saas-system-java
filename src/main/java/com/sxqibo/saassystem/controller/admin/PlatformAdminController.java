package com.sxqibo.saassystem.controller.admin;


import com.sxqibo.saassystem.common.core.domain.BaseResponse;
import com.sxqibo.saassystem.common.util.ServletUtils;
import com.sxqibo.saassystem.dto.admin.AdminLoginDTO;
import com.sxqibo.saassystem.entity.LoginUser;
import com.sxqibo.saassystem.entity.admin.PlatformAdmin;
import com.sxqibo.saassystem.entity.admin.PlatformMenuRule;
import com.sxqibo.saassystem.service.IPlatformMenuRuleService;
import com.sxqibo.saassystem.service.ISysLoginService;
import com.sxqibo.saassystem.service.ISysPermissionService;
import com.sxqibo.saassystem.service.ITokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
    @Autowired
    private ISysLoginService sysLoginService;

    @Autowired
    private ISysPermissionService sysPermissionService;

    @Autowired
    private ITokenService tokenService;

    @Autowired
    private IPlatformMenuRuleService platformMenuRuleService;

    @PostMapping("login")
    public BaseResponse login(@RequestBody AdminLoginDTO requestBody)
    {
        // 生成令牌
        String token = sysLoginService.login(requestBody.getUsername() + "@platform", requestBody.getPassword(),
                requestBody.getCaptchaId(), requestBody.getCaptchaInfo());

        return BaseResponse.success(token);
    }

    /**
     * 获取用户信息及权限信息
     * @return
     */
    @GetMapping("getInfo")
    public BaseResponse getInfo()
    {
        // 用户信息
        LoginUser loginUser = tokenService.getLoginUser(ServletUtils.getRequest());
        PlatformAdmin platformAdmin = loginUser.getPlatformAdmin();

        // 角色集合
        Set<String> groupRule = sysPermissionService.getGroupRule(platformAdmin);
        // 权限集合
        Set<String> menu = sysPermissionService.getMenu(platformAdmin);

        Map<String, Object> map = new HashMap<>();
        map.put("user", platformAdmin);
        map.put("group", groupRule);
        map.put("menu", menu);

        return BaseResponse.success(map);
    }

    /**
     * 获取路由信息（菜单）
     * @return
     */
    @GetMapping("getRouters")
    public BaseResponse getRouters()
    {
        LoginUser loginUser = tokenService.getLoginUser(ServletUtils.getRequest());
        PlatformAdmin platformAdmin = loginUser.getPlatformAdmin();
        List<PlatformMenuRule> platformMenuRules =
                platformMenuRuleService.selectMenuTreeByUserId(platformAdmin.getId());

        return BaseResponse.success(platformMenuRules);
    }
}
