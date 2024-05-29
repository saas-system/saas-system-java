package com.sxqibo.saassystem.service;

import com.sxqibo.saassystem.entity.tenant.TenantAdmin;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 租户 - 管理员表 服务类
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
public interface ITenantAdminService extends IService<TenantAdmin>
{

    TenantAdmin selectAdminByUsername(String username);
}
