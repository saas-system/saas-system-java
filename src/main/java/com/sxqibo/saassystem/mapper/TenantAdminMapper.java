package com.sxqibo.saassystem.mapper;

import com.sxqibo.saassystem.entity.tenant.TenantAdmin;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 租户 - 管理员表 Mapper 接口
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
@Mapper
public interface TenantAdminMapper extends BaseMapper<TenantAdmin>
{
    TenantAdmin selectAdminByUsername(String username);
}
