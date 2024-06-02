package com.sxqibo.saassystem.security;

import cn.hutool.core.collection.CollectionUtil;
import com.alibaba.druid.util.StringUtils;
import com.sxqibo.saassystem.common.util.ServletUtils;
import com.sxqibo.saassystem.entity.LoginUser;
import com.sxqibo.saassystem.entity.admin.PlatformAdminGroup;
import com.sxqibo.saassystem.entity.tenant.TenantAdminGroup;
import com.sxqibo.saassystem.service.ITokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 * 自定义权限校验规则
 */
@Component("pe")
public class PermsExpressionService
{
    private static final String ALL_PERMISSION = "*";

    @Autowired
    private ITokenService tokenService;

    /**
     * 验证用户是否具备某一个权限
     * @param permission
     * @return
     */
    public Boolean hasPerms(String permission)
    {
        if (StringUtils.isEmpty(permission)) {
            return false;
        }

        LoginUser loginUser = tokenService.getLoginUser(ServletUtils.getRequest());

        if (Objects.isNull(loginUser)
                || CollectionUtils.isEmpty(loginUser.getPermissions())) {
            return false;
        }

        return hasPermission(loginUser.getPermissions(), permission);
    }

    /**
     * 判断是否包含权限
     *
     * @param permissions 权限列表
     * @param permission 权限字符串
     * @return
     */
    private Boolean hasPermission(Set<String> permissions, String permission)
    {
        return permissions.contains(permission) || permissions.contains(ALL_PERMISSION);
    }

    /**
     * 验证用户是否具备任意一个权限
     * @param permissions
     * @return
     */
    public Boolean hasAnyPerms(String permissions)
    {
        if (StringUtils.isEmpty(permissions)) {
            return false;
        }

        LoginUser loginUser = tokenService.getLoginUser(ServletUtils.getRequest());

        if (Objects.isNull(loginUser)
                || CollectionUtils.isEmpty(loginUser.getPermissions())) {
            return false;
        }

        Set<String> authorities = loginUser.getPermissions();

        for (String perms: permissions.split(",")) {
            if (perms != null && hasPermission(authorities, perms)) {
                return true;
            }
        }

        return false;
    }

    /**
     * 判断用户是否属于某个组
     *
     * @param groupName
     * @return
     */
    public Boolean hasGroup(String groupName)
    {
        if (StringUtils.isEmpty(groupName)) {
            return false;
        }

        LoginUser loginUser = tokenService.getLoginUser(ServletUtils.getRequest());

        if (Objects.isNull(loginUser)
                || (CollectionUtils.isEmpty(loginUser.getPlatformAdmin().getGroups())
                    && CollectionUtil.isEmpty(loginUser.getTenantAdmin().getGroups()))) {
            return false;
        }
        if (loginUser.getPlatformAdmin() != null) {
            List<PlatformAdminGroup> groups = loginUser.getPlatformAdmin().getGroups();

            for (PlatformAdminGroup group : groups) {
                String name = group.getName();
                if ("超级管理组".equals(name) || name.equals(groupName)) {
                    return true;
                }
            }

            return false;
        } else {
            List<TenantAdminGroup> groups = loginUser.getTenantAdmin().getGroups();
            for (TenantAdminGroup group : groups) {
                String name = group.getName();
                if ("超级管理组".equals(name) || name.equals(groupName)) {
                    return true;
                }
            }

            return false;
        }
    }

    /**
     * 判断用户是否在任意组
     *
     * @param groupNames
     * @return
     */
    public Boolean hasAnyGroup(String groupNames)
    {
        if (StringUtils.isEmpty(groupNames)) {
            return false;
        }

        LoginUser loginUser = tokenService.getLoginUser(ServletUtils.getRequest());

        if (Objects.isNull(loginUser)
                || (CollectionUtils.isEmpty(loginUser.getPlatformAdmin().getGroups())
                && CollectionUtil.isEmpty(loginUser.getTenantAdmin().getGroups()))) {
            return false;
        }

        for (String group : groupNames.split(",")) {
            if (hasGroup(group)) {
                return true;
            }
        }

        return false;
    }
}
