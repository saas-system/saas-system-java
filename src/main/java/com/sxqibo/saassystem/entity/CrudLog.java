package com.sxqibo.saassystem.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 公共 - crud记录表
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
@TableName("crud_log")
public class CrudLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 数据表名
     */
    private String tableName;

    /**
     * 应用类型:admin=平台端,tenant=租户端
     */
    private String app;

    /**
     * 数据表数据
     */
    private String table;

    /**
     * 字段数据
     */
    private String fields;

    /**
     * 状态:delete=已删除,success=成功,error=失败,start=生成中
     */
    private String status;

    /**
     * 数据库连接配置标识
     */
    private String connection;

    /**
     * 创建时间
     */
    private Long createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }
    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }
    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "CrudLog{" +
            "id=" + id +
            ", tableName=" + tableName +
            ", app=" + app +
            ", table=" + table +
            ", fields=" + fields +
            ", status=" + status +
            ", connection=" + connection +
            ", createTime=" + createTime +
        "}";
    }
}
