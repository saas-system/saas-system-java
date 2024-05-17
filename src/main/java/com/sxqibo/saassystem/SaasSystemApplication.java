package com.sxqibo.saassystem;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = "com.sxqibo.saassystem")
@MapperScan("com.sxqibo.saassystem.**.mapper")
@EnableTransactionManagement
public class SaasSystemApplication extends SpringBootServletInitializer
{
	private static final Logger LOGGER = LoggerFactory.getLogger(SaasSystemApplication.class);
	public static void main(String[] args)
	{
		SpringApplication.run(SaasSystemApplication.class, args);

		LOGGER.info("sass-system 系统启动成功");
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
	{
		return application.sources(SaasSystemApplication.class);
	}

}
