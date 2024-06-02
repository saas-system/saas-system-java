package com.sxqibo.saassystem.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sxqibo.saassystem.entity.Area;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * 公共 - 地区表 Mapper 接口
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
@Mapper
public interface AreaMapper extends BaseMapper<Area>
{
    /**
     *
     * @return
     */
    List<Area> findAll();
}
