package com.sxqibo.saassystem.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sxqibo.saassystem.dto.admin.AreaDTO;
import com.sxqibo.saassystem.entity.Area;

import java.util.List;

/**
 * <p>
 * 公共 - 地区表 服务类
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
public interface IAreaService extends IService<Area>
{
    /**
     *
     * @return
     */
    List<AreaDTO> findAllAsTree();
}
