package com.sxqibo.saassystem.mapper;

import com.sxqibo.saassystem.entity.tenant.TenantMenuRule;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 租户 - 菜单和权限规则表 Mapper 接口
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
public interface TenantMenuRuleMapper extends BaseMapper<TenantMenuRule> {

    List<String> selectGroupMenusByMenuIds(List<String> menus);
}
