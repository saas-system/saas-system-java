package com.sxqibo.saassystem.service.impl;

import com.sxqibo.saassystem.entity.TenantUser;
import com.sxqibo.saassystem.mapper.TenantUserMapper;
import com.sxqibo.saassystem.service.ITenantUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 租户 - 用户表 服务实现类
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
@Service
public class TenantUserServiceImpl extends ServiceImpl<TenantUserMapper, TenantUser> implements ITenantUserService {

}
