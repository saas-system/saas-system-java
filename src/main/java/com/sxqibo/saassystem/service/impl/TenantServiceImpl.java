package com.sxqibo.saassystem.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sxqibo.saassystem.dto.admin.TenantDTO;
import com.sxqibo.saassystem.dto.admin.TenantIndexDTO;
import com.sxqibo.saassystem.entity.admin.Tenant;
import com.sxqibo.saassystem.mapper.TenantMapper;
import com.sxqibo.saassystem.service.ITenantService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

/**
 * <p>
 * 租户 - 租户信息表 服务实现类
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
@Service
public class TenantServiceImpl extends ServiceImpl<TenantMapper, Tenant> implements ITenantService
{
    @Autowired
    private TenantMapper tenantMapper;


    @Override
    public Page<Tenant> pageIndex(TenantIndexDTO requestParams)
    {
        Page<Tenant> page = new Page<>(requestParams.getPage(), requestParams.getLimit());
        tenantMapper.selectPage(page, null);
        return page;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Tenant> queryList(Tenant tenant)
    {
        return tenantMapper.queryList(tenant);
    }

    @Override
    public int insertTenant(TenantDTO tenantDTO)
    {
        Tenant tenant = new Tenant();

        BeanUtils.copyProperties(tenantDTO, tenant);
        tenant.setExpireTime(tenantDTO.getExpireTime());

        return tenantMapper.insert(tenant);
    }

    @Override
    public Tenant selectTenantById(String id)
    {
        return tenantMapper.selectById(id);
    }

    @Override
    public int updateTenant(TenantDTO tenantDTO)
    {
        Tenant tenant = new Tenant();

        BeanUtils.copyProperties(tenantDTO, tenant);
        tenant.setExpireTime(tenantDTO.getExpireTime());

        return tenantMapper.updateById(tenant);
    }

    @Override
    public int deleteTenant(String[] ids)
    {
        return tenantMapper.deleteBatchIds(Arrays.asList(ids));
    }
}
