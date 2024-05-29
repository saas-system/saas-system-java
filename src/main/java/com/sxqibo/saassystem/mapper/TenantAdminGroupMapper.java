package com.sxqibo.saassystem.mapper;

import com.sxqibo.saassystem.entity.tenant.TenantAdminGroup;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 租户 - 管理分组表 Mapper 接口
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
public interface TenantAdminGroupMapper extends BaseMapper<TenantAdminGroup> {

    List<String> selectGroupNamesByUserId(Integer userId);

    List<String> selectGroupRules(Integer userId);
}
