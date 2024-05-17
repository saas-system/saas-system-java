package com.sxqibo.saassystem.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 公共 -短信模版变量表
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
@TableName("sms_variable")
public class SmsVariable implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 标题
     */
    private String title;

    /**
     * 变量名称
     */
    private String name;

    /**
     * 变量值来源:literal=字面量,func=方法返回值,sql=sql查询结果
     */
    private String valueSource;

    /**
     * 变量值
     */
    private String value;

    /**
     * SQL语句
     */
    private String sql;

    /**
     * 命名空间
     */
    private String namespace;

    /**
     * 类名
     */
    @TableField(value = "class")
    private String clazz;

    /**
     * 方法名
     */
    private String func;

    /**
     * 传递的参数
     */
    private String param;

    /**
     * 状态:0=禁用,1=启用
     */
    private Boolean status;

    /**
     * 创建时间
     */
    private Long createTime;

    /**
     * 更新时间
     */
    private Long updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getValueSource() {
        return valueSource;
    }

    public void setValueSource(String valueSource) {
        this.valueSource = valueSource;
    }
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }
    public String getClazz() {
        return clazz;
    }

    public void setClass(String clazz) {
        this.clazz = clazz;
    }
    public String getFunc() {
        return func;
    }

    public void setFunc(String func) {
        this.func = func;
    }
    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "SmsVariable{" +
            "id=" + id +
            ", title=" + title +
            ", name=" + name +
            ", valueSource=" + valueSource +
            ", value=" + value +
            ", sql=" + sql +
            ", namespace=" + namespace +
            ", class=" + clazz +
            ", func=" + func +
            ", param=" + param +
            ", status=" + status +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
        "}";
    }
}
