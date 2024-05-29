package com.sxqibo.saassystem.service.impl;

import com.sxqibo.saassystem.entity.tenant.TenantAdminGroupAccess;
import com.sxqibo.saassystem.mapper.TenantAdminGroupAccessMapper;
import com.sxqibo.saassystem.service.ITenantAdminGroupAccessService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 租户 - 管理权限分组表 服务实现类
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
@Service
public class TenantAdminGroupAccessServiceImpl
        extends ServiceImpl<TenantAdminGroupAccessMapper, TenantAdminGroupAccess>
        implements ITenantAdminGroupAccessService
{

}
