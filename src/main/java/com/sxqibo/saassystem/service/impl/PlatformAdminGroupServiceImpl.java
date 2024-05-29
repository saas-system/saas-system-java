package com.sxqibo.saassystem.service.impl;

import com.sxqibo.saassystem.entity.admin.PlatformAdminGroup;
import com.sxqibo.saassystem.mapper.PlatformAdminGroupMapper;
import com.sxqibo.saassystem.service.IPlatformAdminGroupService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <p>
 * 平台 - 管理分组表 服务实现类
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
@Service
public class PlatformAdminGroupServiceImpl
        extends ServiceImpl<PlatformAdminGroupMapper, PlatformAdminGroup>
        implements IPlatformAdminGroupService
{

    @Autowired
    private PlatformAdminGroupMapper platformAdminGroupMapper;

    @Override
    public Set<String> selectGroupNamesByUserId(Integer userId)
    {
        List<String> list = platformAdminGroupMapper.selectGroupNamesByUserId(userId);

        Set<String> permsSet = new HashSet<>();

        for (String group : list) {
            permsSet.add(group);
        }

        return permsSet;
    }
}
