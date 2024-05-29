package com.sxqibo.saassystem.service;

import com.sxqibo.saassystem.entity.tenant.TenantMenuRule;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Set;

/**
 * <p>
 * 租户 - 菜单和权限规则表 服务类
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
public interface ITenantMenuRuleService extends IService<TenantMenuRule> {

    Set<String> selectGroupMenusByUserId(Integer userId);
}
