package com.sxqibo.saassystem.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 敏感数据表
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
@TableName("security_sensitive_data")
public class SecuritySensitiveData implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 规则名称
     */
    private String name;

    /**
     * 控制器
     */
    private String controller;

    /**
     * 处理后的控制器名
     */
    private String controllerAs;

    /**
     * 对应数据表
     */
    private String dataTable;

    /**
     * 数据库连接配置标识
     */
    private String connection;

    /**
     * 数据表主键字段
     */
    private String primaryKey;

    /**
     * 敏感数据字段
     */
    private String dataFields;

    /**
     * 状态:0=关闭,1=启用
     */
    private Boolean status;

    /**
     * 修改时间
     */
    private Long updateTime;

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
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getController() {
        return controller;
    }

    public void setController(String controller) {
        this.controller = controller;
    }
    public String getControllerAs() {
        return controllerAs;
    }

    public void setControllerAs(String controllerAs) {
        this.controllerAs = controllerAs;
    }
    public String getDataTable() {
        return dataTable;
    }

    public void setDataTable(String dataTable) {
        this.dataTable = dataTable;
    }
    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }
    public String getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
    }
    public String getDataFields() {
        return dataFields;
    }

    public void setDataFields(String dataFields) {
        this.dataFields = dataFields;
    }
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "SecuritySensitiveData{" +
            "id=" + id +
            ", name=" + name +
            ", controller=" + controller +
            ", controllerAs=" + controllerAs +
            ", dataTable=" + dataTable +
            ", connection=" + connection +
            ", primaryKey=" + primaryKey +
            ", dataFields=" + dataFields +
            ", status=" + status +
            ", updateTime=" + updateTime +
            ", createTime=" + createTime +
        "}";
    }
}
