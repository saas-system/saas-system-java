package com.sxqibo.saassystem.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sxqibo.saassystem.entity.admin.PlatformAdmin;
import com.sxqibo.saassystem.mapper.PlatformAdminMapper;
import com.sxqibo.saassystem.service.IPlatformAdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 平台 - 管理员表 服务实现类
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
@Service
public class PlatformAdminServiceImpl
        extends ServiceImpl<PlatformAdminMapper, PlatformAdmin>
        implements IPlatformAdminService
{
    @Autowired
    private PlatformAdminMapper platformAdminMapper;

    public PlatformAdmin selectAdminByUsername(String username)
    {
        return platformAdminMapper.selectAdminByUsername(username);
    }
}
