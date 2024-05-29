package com.sxqibo.saassystem.mapper;

import com.sxqibo.saassystem.entity.admin.PlatformMenuRule;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * 平台 - 菜单和权限规则表 Mapper 接口
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
@Mapper
public interface PlatformMenuRuleMapper extends BaseMapper<PlatformMenuRule>
{
    /**
     *
     */
    List<String> selectGroupMenusByMenuIds(List<String> menuIds);

    /**
     * 用户为超级管理员查询全部菜单信息
     * @return
     */
    List<PlatformMenuRule> selectMenuTreeAll();


    List<PlatformMenuRule> selectMenuTreeByIds(List<String> menuIds);
}
