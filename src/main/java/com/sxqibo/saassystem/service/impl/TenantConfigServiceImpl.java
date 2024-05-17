package com.sxqibo.saassystem.service.impl;

import com.sxqibo.saassystem.entity.TenantConfig;
import com.sxqibo.saassystem.mapper.TenantConfigMapper;
import com.sxqibo.saassystem.service.ITenantConfigService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 租户 - 配置表 服务实现类
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
@Service
public class TenantConfigServiceImpl extends ServiceImpl<TenantConfigMapper, TenantConfig> implements ITenantConfigService {

}
