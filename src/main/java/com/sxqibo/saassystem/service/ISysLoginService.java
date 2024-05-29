package com.sxqibo.saassystem.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sxqibo.saassystem.entity.admin.PlatformAdmin;

public interface ISysLoginService
{
    String login(String username, String password, String code, String uuid);
}
