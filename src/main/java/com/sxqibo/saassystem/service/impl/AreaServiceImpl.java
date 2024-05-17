package com.sxqibo.saassystem.service.impl;

import com.sxqibo.saassystem.dto.admin.AreaDTO;
import com.sxqibo.saassystem.entity.Area;
import com.sxqibo.saassystem.mapper.AreaMapper;
import com.sxqibo.saassystem.service.IAreaService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 * 公共 - 地区表 服务实现类
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
@Service
public class AreaServiceImpl extends ServiceImpl<AreaMapper, Area> implements IAreaService
{
    @Autowired
    private AreaMapper areaMapper;

    @Override
    public List<AreaDTO> findAllAsTree()
    {
        List<Area> list = areaMapper.findAll();

        return list.stream()
                .filter(area -> area.getPid().equals(0))
                .map(area -> {
                    AreaDTO areaDTO = new AreaDTO();
                    areaDTO.setCode(area.getId());
                    areaDTO.setName(area.getName());
                    areaDTO.setChildren(getChildrenArea(areaDTO, list));

                    return areaDTO;
                }).collect(Collectors.toList());
    }

    private List<AreaDTO> getChildrenArea(AreaDTO areaDTO, List<Area> list)
    {
        List<Area> subAreaList = list.stream()
                        .filter(area -> area.getPid().equals(areaDTO.getCode()))
                        .collect(Collectors.toList());
        if (subAreaList.size() != 0) {
            return subAreaList.stream().map(area -> {
                AreaDTO subAreaDTO = new AreaDTO();
                subAreaDTO.setName(area.getName());
                subAreaDTO.setCode(area.getId());
                subAreaDTO.setChildren(getChildrenArea(subAreaDTO, list));

                return subAreaDTO;
            }).collect(Collectors.toList());
        }

        return null;
    }
}
