package com.sxqibo.saassystem.mapper;

import com.sxqibo.saassystem.entity.admin.Tenant;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * 租户 - 租户信息表 Mapper 接口
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
@Mapper
public interface TenantMapper extends BaseMapper<Tenant>
{
    @Select("SELECT * FROM tenant")
    List<Tenant> queryList(Tenant tenant);
}
