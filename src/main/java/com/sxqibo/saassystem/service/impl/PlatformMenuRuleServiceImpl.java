package com.sxqibo.saassystem.service.impl;

import com.sxqibo.saassystem.entity.admin.PlatformMenuRule;
import com.sxqibo.saassystem.mapper.PlatformAdminGroupMapper;
import com.sxqibo.saassystem.mapper.PlatformMenuRuleMapper;
import com.sxqibo.saassystem.service.IPlatformMenuRuleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

/**
 * <p>
 * 平台 - 菜单和权限规则表 服务实现类
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
@Service
public class PlatformMenuRuleServiceImpl
        extends ServiceImpl<PlatformMenuRuleMapper, PlatformMenuRule>
        implements IPlatformMenuRuleService
{
    @Autowired
    private PlatformMenuRuleMapper platformMenuRuleMapper;

    @Autowired
    private PlatformAdminGroupMapper platformAdminGroupMapper;

    @Override
    public Set<String> selectGroupMenusByUserId(Integer userId)
    {
        List<String> list = platformAdminGroupMapper.selectGroupRules(userId);

        List<String> menus = new ArrayList<>();
        for (String s : list) {
            List<String> strings = Arrays.asList(s.split(","));
            menus.addAll(strings);
        }

        List<String> menuList = platformMenuRuleMapper.selectGroupMenusByMenuIds(menus);

        Set<String> permsSet = new HashSet<>();

        for (String perm : menuList) {
            if (!StringUtils.isEmpty(perm)) {
                permsSet.add(perm);
            }
        }

        return permsSet;
    }

    @Override
    public List<PlatformMenuRule> selectMenuTreeByUserId(Integer userId)
    {
        List<String> list = platformAdminGroupMapper.selectGroupRules(userId);

        List<PlatformMenuRule> platformMenuRules = null;

        if ("*".equals(list.get(0))) {
            // 有所有权限
            platformMenuRules = platformMenuRuleMapper.selectMenuTreeAll();
        } else {
            // 有部分菜单权限
            List<String> menus = new ArrayList<>();
            for (String s : list) {
                List<String> strings = Arrays.asList(s.split(","));
                menus.addAll(strings);
            }
            platformMenuRules = platformMenuRuleMapper.selectMenuTreeByIds(menus);
        }

        // 封装子菜单

        return getChildMenuRules(platformMenuRules, 0);
    }

    /**
     * 根据父节点id获取子节点
     *
     * @param platformMenuRules 菜单列表
     * @param parentId 上级菜单id
     * @return 有父子结构的菜单集合
     */
    private List<PlatformMenuRule> getChildMenuRules(
            List<PlatformMenuRule> platformMenuRules,
            Integer parentId)
    {
        List<PlatformMenuRule> list = new ArrayList<>();

        platformMenuRules.stream()
                .filter(m -> m.getPid().equals(parentId))
                .forEach(m -> {
                    recursionFn(platformMenuRules, m);
                    list.add(m);
                });

        return list;
    }

    /**
     * 递归获取子菜单
     *
     * @param platformMenuRules
     * @param m
     */
    private void recursionFn(List<PlatformMenuRule> platformMenuRules,
                             PlatformMenuRule m)
    {
        // 获取子节点列表
        List<PlatformMenuRule> children = getChildList(platformMenuRules, m);
        m.setChildren(children);
        for (PlatformMenuRule subMenu: children) {
            // 判断子节点下面还有节点
            if (getChildList(platformMenuRules, subMenu).size() > 0) {
                recursionFn(platformMenuRules, subMenu);
            }
        }
    }

    /**
     * 得到子节点列表
     *
     * @param platformMenuRules
     * @param m
     * @return
     */
    private List<PlatformMenuRule> getChildList(List<PlatformMenuRule> platformMenuRules,
                                                PlatformMenuRule m)
    {
        return platformMenuRules.stream()
                .filter(sub -> sub.getPid().equals(m.getId()))
                .collect(Collectors.toList());
    }
}
