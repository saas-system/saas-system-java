package com.sxqibo.saassystem.service;

import com.sxqibo.saassystem.entity.admin.PlatformAdmin;
import com.sxqibo.saassystem.entity.tenant.TenantAdmin;

import java.util.Set;

public interface ISysPermissionService
{
    /**
     * 获取角色数据权限
     * @param platformAdmin
     * @return
     */
    Set<String> getGroupRule(PlatformAdmin platformAdmin);

    /**
     * 获取菜单数据权限
     * @param platformAdmin
     * @return
     */
    Set<String> getMenu(PlatformAdmin platformAdmin);


    Set<String> getGroupRule(TenantAdmin tenantAdmin);

    Set<String> getMenu(TenantAdmin tenantAdmin);
}
