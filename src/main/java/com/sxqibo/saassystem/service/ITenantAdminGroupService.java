package com.sxqibo.saassystem.service;

import com.sxqibo.saassystem.entity.tenant.TenantAdminGroup;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Set;

/**
 * <p>
 * 租户 - 管理分组表 服务类
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
public interface ITenantAdminGroupService extends IService<TenantAdminGroup> {

    Set<String> selectGroupNamesByUserId(Integer userId);
}
