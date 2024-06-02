package com.sxqibo.saassystem.controller.admin;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sxqibo.saassystem.common.constant.HttpStatus;
import com.sxqibo.saassystem.common.core.controller.BaseController;
import com.sxqibo.saassystem.common.core.domain.BaseResponse;
import com.sxqibo.saassystem.common.core.page.PageResult;
import com.sxqibo.saassystem.common.util.ServletUtils;
import com.sxqibo.saassystem.dto.admin.TenantDTO;
import com.sxqibo.saassystem.dto.admin.TenantIndexDTO;
import com.sxqibo.saassystem.entity.admin.Tenant;
import com.sxqibo.saassystem.service.ITenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 租户 - 租户信息表 前端控制器
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
@RestController
@RequestMapping("/admin/tenant.Tenant")
public class TenantController extends BaseController
{
    @Autowired
    private ITenantService tenantService;

    @GetMapping("index")
    @PreAuthorize("@pe.hasPerms('tenant/tenant/index')")
    public BaseResponse<Page<Tenant>> index(TenantIndexDTO requestParams)
    {
        Page<Tenant> page = tenantService.pageIndex(requestParams);

        return BaseResponse.success(page);
    }

    @GetMapping("list")
    public PageResult list(Tenant tenant)
    {
        // 获取分页参数
        Integer pageNum = ServletUtils.getParameterToInt("pageNum");
        Integer pageSize = ServletUtils.getParameterToInt("pageSize");

        // 使用分页使用PageHelper
        PageHelper.startPage(pageNum, pageSize);

        List<Tenant> list = tenantService.queryList(tenant);

        PageResult pageResult = new PageResult();
        pageResult.setCode(HttpStatus.SUCCESS);
        pageResult.setMsg("分页查询成功");
        pageResult.setRows(list);
        pageResult.setTotal(new PageInfo<>(list).getTotal());

        return pageResult;
    }

    /**
     * 上面方法的简化版本
     *
     * @param tenant
     * @return
     */
    @GetMapping("listSimple")
    public PageResult listSimple(Tenant tenant)
    {
        startPage();
        List<Tenant> list = tenantService.queryList(tenant);
        return getData(list);
    }

    @PostMapping("add")
    public BaseResponse add(@RequestBody TenantDTO tenantDTO)
    {
        return toAjax(tenantService.insertTenant(tenantDTO));
    }

    @GetMapping("edit")
    public BaseResponse getInfo(@RequestParam("id") String id)
    {
        return BaseResponse.success(tenantService.selectTenantById(id));
    }

    @PostMapping("edit")
    public BaseResponse edit(@RequestBody TenantDTO tenantDTO)
    {
        return toAjax(tenantService.updateTenant(tenantDTO));
    }

    @DeleteMapping("del")
    @PreAuthorize("@pe.hasPerms('tenant/tenant/del')")
    public BaseResponse del(@RequestParam(name = "ids[]", required = true) String[] ids)
    {
        return toAjax(tenantService.deleteTenant(ids));
    }
}
