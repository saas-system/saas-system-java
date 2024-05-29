package com.sxqibo.saassystem.service.impl;

import com.sxqibo.saassystem.entity.tenant.TenantMenuRule;
import com.sxqibo.saassystem.mapper.TenantAdminGroupMapper;
import com.sxqibo.saassystem.mapper.TenantMenuRuleMapper;
import com.sxqibo.saassystem.service.ITenantMenuRuleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.*;

/**
 * <p>
 * 租户 - 菜单和权限规则表 服务实现类
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
@Service
public class TenantMenuRuleServiceImpl
        extends ServiceImpl<TenantMenuRuleMapper, TenantMenuRule>
        implements ITenantMenuRuleService
{
    @Autowired
    private TenantMenuRuleMapper tenantMenuRuleMapper;

    @Autowired
    private TenantAdminGroupMapper tenantAdminGroupMapper;

    @Override
    public Set<String> selectGroupMenusByUserId(Integer userId)
    {
        List<String> list = tenantAdminGroupMapper.selectGroupRules(userId);

        List<String> menus = new ArrayList<>();
        for (String s : list) {
            List<String> strings = Arrays.asList(s.split(","));
            menus.addAll(strings);
        }

        List<String> menuList = tenantMenuRuleMapper.selectGroupMenusByMenuIds(menus);

        Set<String> permsSet = new HashSet<>();

        for (String perm : menuList) {
            if (!StringUtils.isEmpty(perm)) {
                permsSet.add(perm);
            }
        }

        return permsSet;
    }
}
