package com.sxqibo.saassystem.service.impl;

import com.sxqibo.saassystem.entity.CrudLog;
import com.sxqibo.saassystem.mapper.CrudLogMapper;
import com.sxqibo.saassystem.service.ICrudLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 公共 - crud记录表 服务实现类
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
@Service
public class CrudLogServiceImpl extends ServiceImpl<CrudLogMapper, CrudLog> implements ICrudLogService {

}
