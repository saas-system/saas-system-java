package com.sxqibo.saassystem.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 敏感数据修改记录
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
@TableName("security_sensitive_data_log")
public class SecuritySensitiveDataLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 管理员
     */
    private Integer adminId;

    /**
     * 敏感数据规则ID
     */
    private Integer sensitiveId;

    /**
     * 所在数据表
     */
    private String dataTable;

    /**
     * 数据库连接配置标识
     */
    private String connection;

    /**
     * 数据表主键
     */
    private String primaryKey;

    /**
     * 被修改字段
     */
    private String dataField;

    /**
     * 被修改项
     */
    private String dataComment;

    /**
     * 被修改项主键值
     */
    private String idValue;

    /**
     * 修改前
     */
    private String before;

    /**
     * 修改后
     */
    private String after;

    /**
     * 操作者IP
     */
    private String ip;

    /**
     * User Agent
     */
    private String useragent;

    /**
     * 是否已回滚:0=否,1=是
     */
    private Boolean isRollback;

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
    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }
    public Integer getSensitiveId() {
        return sensitiveId;
    }

    public void setSensitiveId(Integer sensitiveId) {
        this.sensitiveId = sensitiveId;
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
    public String getDataField() {
        return dataField;
    }

    public void setDataField(String dataField) {
        this.dataField = dataField;
    }
    public String getDataComment() {
        return dataComment;
    }

    public void setDataComment(String dataComment) {
        this.dataComment = dataComment;
    }
    public String getIdValue() {
        return idValue;
    }

    public void setIdValue(String idValue) {
        this.idValue = idValue;
    }
    public String getBefore() {
        return before;
    }

    public void setBefore(String before) {
        this.before = before;
    }
    public String getAfter() {
        return after;
    }

    public void setAfter(String after) {
        this.after = after;
    }
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
    public String getUseragent() {
        return useragent;
    }

    public void setUseragent(String useragent) {
        this.useragent = useragent;
    }
    public Boolean getIsRollback() {
        return isRollback;
    }

    public void setIsRollback(Boolean isRollback) {
        this.isRollback = isRollback;
    }
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "SecuritySensitiveDataLog{" +
            "id=" + id +
            ", adminId=" + adminId +
            ", sensitiveId=" + sensitiveId +
            ", dataTable=" + dataTable +
            ", connection=" + connection +
            ", primaryKey=" + primaryKey +
            ", dataField=" + dataField +
            ", dataComment=" + dataComment +
            ", idValue=" + idValue +
            ", before=" + before +
            ", after=" + after +
            ", ip=" + ip +
            ", useragent=" + useragent +
            ", isRollback=" + isRollback +
            ", createTime=" + createTime +
        "}";
    }
}
