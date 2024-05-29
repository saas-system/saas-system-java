package com.sxqibo.saassystem.service;

import com.sxqibo.saassystem.entity.admin.PlatformMenuRule;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Set;

/**
 * <p>
 * 平台 - 菜单和权限规则表 服务类
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
public interface IPlatformMenuRuleService extends IService<PlatformMenuRule>
{
    /**
     * 根据用户id查询菜单信息
     */
    Set<String> selectGroupMenusByUserId(Integer userId);

    /**
     * 根据用户id查询菜单信息
     *
     * @param userId
     * @return
     */
    List<PlatformMenuRule> selectMenuTreeByUserId(Integer userId);
}
