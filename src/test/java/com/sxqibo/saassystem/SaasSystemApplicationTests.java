package com.sxqibo.saassystem;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sxqibo.saassystem.entity.admin.Tenant;
import com.sxqibo.saassystem.mapper.TenantMapper;
import com.sxqibo.saassystem.service.ITenantService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SaasSystemApplicationTests
{
	@Autowired
	private ITenantService tenantService;

	@Autowired
	private TenantMapper tenantMapper;

	@Test
	void contextLoads()
	{
	}

	@Test
	void test()
	{
		Page<Tenant> page = new Page<>(1, 10);
		tenantMapper.selectPage(page, null);

		List<Tenant> list = page.getRecords();
		list.forEach(System.out::println);
		System.out.println(page.getCurrent());
		System.out.println(page.getSize());
		System.out.println(page.getTotal());
		System.out.println(page.getPages());
		System.out.println(page.hasPrevious());
		System.out.println(page.hasNext());
	}
}
