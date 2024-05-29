package com.sxqibo.saassystem.service.impl;

import com.sxqibo.saassystem.entity.admin.PlatformAdmin;
import com.sxqibo.saassystem.entity.tenant.TenantAdmin;
import com.sxqibo.saassystem.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class SysPermissionService implements ISysPermissionService
{
    @Autowired
    private IPlatformAdminGroupService platformAdminGroupService;

    @Autowired
    private IPlatformMenuRuleService platformMenuRuleService;

    @Autowired
    private ITenantAdminGroupService tenantAdminGroupService;

    @Autowired
    private ITenantMenuRuleService tenantMenuRuleService;

    /**
     * 获取角色数据权限
     * @param platformAdmin
     * @return
     */
    public Set<String> getGroupRule(PlatformAdmin platformAdmin)
    {
        Set<String> groups = new HashSet<>();

        groups = platformAdminGroupService.selectGroupNamesByUserId(platformAdmin.getId());

        return groups;
    }

    /**
     * 获取菜单数据权限
     * @param platformAdmin
     * @return
     */
    public Set<String> getMenu(PlatformAdmin platformAdmin)
    {
        Set<String> menu = new HashSet<>();

        menu = platformMenuRuleService.selectGroupMenusByUserId(platformAdmin.getId());

        return menu;
    }

    @Override
    public Set<String> getGroupRule(TenantAdmin tenantAdmin)
    {
        Set<String> groups = new HashSet<>();

        groups = tenantAdminGroupService.selectGroupNamesByUserId(tenantAdmin.getId());

        return groups;
    }

    @Override
    public Set<String> getMenu(TenantAdmin tenantAdmin)
    {
        Set<String> menu = new HashSet<>();

        menu = tenantMenuRuleService.selectGroupMenusByUserId(tenantAdmin.getId());

        return menu;
    }


}
