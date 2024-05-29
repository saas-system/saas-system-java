package com.sxqibo.saassystem.service.impl;

import com.sxqibo.saassystem.entity.tenant.TenantAdminGroup;
import com.sxqibo.saassystem.mapper.TenantAdminGroupMapper;
import com.sxqibo.saassystem.service.ITenantAdminGroupService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <p>
 * 租户 - 管理分组表 服务实现类
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
@Service
public class TenantAdminGroupServiceImpl
        extends ServiceImpl<TenantAdminGroupMapper, TenantAdminGroup>
        implements ITenantAdminGroupService
{
    @Autowired
    private TenantAdminGroupMapper tenantAdminGroupMapper;

    @Override
    public Set<String> selectGroupNamesByUserId(Integer userId)
    {
        List<String> list = tenantAdminGroupMapper.selectGroupNamesByUserId(userId);

        Set<String> permsSet = new HashSet<>();

        for (String group : list) {
            permsSet.add(group);
        }

        return permsSet;
    }
}
