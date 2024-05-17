package com.sxqibo.saassystem.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sxqibo.saassystem.dto.admin.TenantDTO;
import com.sxqibo.saassystem.dto.admin.TenantIndexDTO;
import com.sxqibo.saassystem.entity.admin.Tenant;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 租户 - 租户信息表 服务类
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
public interface ITenantService extends IService<Tenant>
{
    Page<Tenant> pageIndex(TenantIndexDTO requestParams);
    List<Tenant> queryList(Tenant tenant);

    int insertTenant(TenantDTO tenantDTO);
}
