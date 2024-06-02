package com.sxqibo.saassystem;

import com.sxqibo.saassystem.entity.admin.PlatformAdmin;
import com.sxqibo.saassystem.entity.tenant.TenantAdmin;
import com.sxqibo.saassystem.mapper.PlatformAdminGroupMapper;
import com.sxqibo.saassystem.mapper.PlatformAdminMapper;
import com.sxqibo.saassystem.mapper.PlatformMenuRuleMapper;
import com.sxqibo.saassystem.mapper.TenantAdminMapper;
import com.sxqibo.saassystem.service.IPlatformAdminGroupService;
import com.sxqibo.saassystem.service.IPlatformAdminService;
import com.sxqibo.saassystem.service.IPlatformMenuRuleService;
import com.sxqibo.saassystem.service.ISysLoginService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class MapperTest
{
    @Autowired
    private PlatformAdminMapper platformAdminMapper;

    @Autowired
    private IPlatformAdminService platformAdminService;
    @Test
    public void testSelect()
    {
        List<PlatformAdmin> platformAdmins = platformAdminMapper.selectList(null);
        System.out.println(platformAdmins);
    }

    @Test
    public void testSelect1()
    {
        System.out.println(platformAdminService.selectAdminByUsername("admin"));
    }

    @Test
    public void testPlatformAdmin()
    {
        PlatformAdmin platformAdmin = platformAdminMapper.selectAdminByUsername("admin");
        System.out.println(platformAdmin);
    }

    @Autowired
    private IPlatformAdminGroupService platformAdminGroupService;

    @Autowired
    private IPlatformMenuRuleService platformMenuRuleService;

    @Test
    public void testGroup()
    {
        System.out.println(platformAdminGroupService.selectGroupNamesByUserId(4));
        System.out.println(platformAdminGroupService.selectGroupNamesByUserId(1));
    }

    @Test
    public void testMenu()
    {
        System.out.println(platformMenuRuleService.selectGroupMenusByUserId(4));
        System.out.println(platformMenuRuleService.selectGroupMenusByUserId(1));
    }

    @Autowired
    private TenantAdminMapper tenantAdminMapper;

    @Test
    public void testTenantAdmin()
    {
        TenantAdmin tenantAdmin = tenantAdminMapper.selectAdminByUsername("tenant_admin");

        System.out.println(tenantAdmin);
    }


    @Autowired
    private ISysLoginService sysLoginService;

    @Test
    public void testLogin()
    {
        String admin = sysLoginService.login("admin", "123456", null, null);
    }

    @Autowired
    private PlatformMenuRuleMapper platformMenuRuleMapper;

    @Test
    public void testMenuTree()
    {
        System.out.println(platformMenuRuleMapper.selectMenuTreeAll());
    }
    @Autowired
    private PlatformAdminGroupMapper platformAdminGroupMapper;
    @Test
    void testMenuTreeById()
    {
        List<String> list = platformAdminGroupMapper.selectGroupRules(4);

        List<String> menus = new ArrayList<>();
        for (String s : list) {
            List<String> strings = Arrays.asList(s.split(","));
            menus.addAll(strings);
        }

        System.out.println(platformMenuRuleMapper.selectMenuTreeByIds(menus));
    }

    @Test
    public void testSelectMenuTree()
    {
        System.out.println(platformMenuRuleService.selectMenuTreeByUserId(1));

        System.out.println(platformMenuRuleService.selectMenuTreeByUserId(4));
    }
}
