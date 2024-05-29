package com.sxqibo.saassystem.common.mybatisplus.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

@Component
public class FieldMetaObjectHandler implements MetaObjectHandler
{
    private final static String CREATE_TIME = "createTime";
    private final static String CREATOR = "creator";
    private final static String UPDATE_TIME = "updateTime";
    private final static String UPDATER = "updater";
    private final static String ORG_ID = "orgId";
    private final static String VERSION = "version";
    private final static String DELETED = "deleteTime";

    @Override
    public void insertFill(MetaObject metaObject)
    {
//        UserDetail user = SecurityUser.getUser();
//        LocalDateTime now = LocalDateTime.now();
//
//        // 用户字段填充
//        if (user != null) {
//            // 创建者
//            setFieldValByName(CREATOR, user.getId(), metaObject);
//            // 更新者
//            setFieldValByName(UPDATER, user.getId(), metaObject);
//            // 创建者所属机构
//            setFieldValByName(ORG_ID, user.getOrgId(), metaObject);
//        }
//
//        // 创建时间
//        setFieldValByName(CREATE_TIME, now, metaObject);
//        // 更新时间
//        setFieldValByName(UPDATE_TIME, now, metaObject);
//        // 版本号
//        setFieldValByName(VERSION, 0, metaObject);
//        // 删除标识
//        setFieldValByName(DELETED, 0, metaObject);
        setFieldValByName(CREATE_TIME, System.currentTimeMillis() / 1000, metaObject);
        setFieldValByName(UPDATE_TIME, System.currentTimeMillis() / 1000, metaObject);
        setFieldValByName(DELETED, 0L, metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject)
    {
//        // 更新者
//        setFieldValByName(UPDATER, SecurityUser.getUserId(), metaObject);
//        // 更新时间
//        setFieldValByName(UPDATE_TIME, LocalDateTime.now(), metaObject);
        setFieldValByName(UPDATE_TIME, System.currentTimeMillis() / 1000, metaObject);
    }
}
