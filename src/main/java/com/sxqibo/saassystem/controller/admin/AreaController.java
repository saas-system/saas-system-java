package com.sxqibo.saassystem.controller.admin;


import com.sxqibo.saassystem.common.core.domain.BaseResponse;
import com.sxqibo.saassystem.service.IAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * <p>
 * 公共 - 地区表 前端控制器
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
@RestController
@RequestMapping("/admin/ajax")
public class AreaController
{
    @Autowired
    private IAreaService areaService;

    @GetMapping("area")
    public BaseResponse area()
    {
        return null;
    }

    @RequestMapping("tree")
    public BaseResponse getAreaTree()
    {
        return BaseResponse.success(areaService.findAllAsTree());
    }
}
