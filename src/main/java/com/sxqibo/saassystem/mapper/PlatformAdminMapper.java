package com.sxqibo.saassystem.mapper;

import com.sxqibo.saassystem.entity.admin.PlatformAdmin;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 平台 - 管理员表 Mapper 接口
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
@Mapper
public interface PlatformAdminMapper extends BaseMapper<PlatformAdmin>
{
    /**
     * 通过用户名查询用户
     * @param username
     * @return
     */
    PlatformAdmin selectAdminByUsername(String username);
}
