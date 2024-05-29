package com.sxqibo.saassystem.mapper;

import com.sxqibo.saassystem.entity.admin.PlatformAdminGroup;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * 平台 - 管理分组表 Mapper 接口
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
@Mapper
public interface PlatformAdminGroupMapper extends BaseMapper<PlatformAdminGroup>
{
    /**
     * 根据用户ID查询角色权限
     * @param userId
     * @return
     */
    List<String> selectGroupNamesByUserId(Integer userId);

    List<String> selectGroupRules(Integer userId);
}
