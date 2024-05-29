package com.sxqibo.saassystem.service;

import com.sxqibo.saassystem.entity.admin.PlatformAdminGroup;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Set;

/**
 * <p>
 * 平台 - 管理分组表 服务类
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
public interface IPlatformAdminGroupService extends IService<PlatformAdminGroup>
{
    /**
     * 根据用户id查询用户信息
     * @param userId
     * @return
     */
    Set<String> selectGroupNamesByUserId(Integer userId);
}
