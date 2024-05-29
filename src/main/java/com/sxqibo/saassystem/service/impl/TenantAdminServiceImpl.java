package com.sxqibo.saassystem.service.impl;

import com.sxqibo.saassystem.entity.tenant.TenantAdmin;
import com.sxqibo.saassystem.mapper.TenantAdminMapper;
import com.sxqibo.saassystem.service.ITenantAdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 租户 - 管理员表 服务实现类
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
@Service
public class TenantAdminServiceImpl
        extends ServiceImpl<TenantAdminMapper, TenantAdmin>
        implements ITenantAdminService
{
    @Autowired
    private TenantAdminMapper tenantAdminMapper;

    @Override
    public TenantAdmin selectAdminByUsername(String username)
    {
        return tenantAdminMapper.selectAdminByUsername(username);
    }
}
