package com.sxqibo.saassystem.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 数据回收记录表
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
@TableName("security_data_recycle_log")
public class SecurityDataRecycleLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 操作管理员
     */
    private Integer adminId;

    /**
     * 回收规则ID
     */
    private Integer recycleId;

    /**
     * 回收的数据
     */
    private String data;

    /**
     * 数据表
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
     * 是否已还原:0=否,1=是
     */
    private Boolean isRestore;

    /**
     * 操作者IP
     */
    private String ip;

    /**
     * User Agent
     */
    private String useragent;

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
    public Integer getRecycleId() {
        return recycleId;
    }

    public void setRecycleId(Integer recycleId) {
        this.recycleId = recycleId;
    }
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
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
    public Boolean getIsRestore() {
        return isRestore;
    }

    public void setIsRestore(Boolean isRestore) {
        this.isRestore = isRestore;
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
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "SecurityDataRecycleLog{" +
            "id=" + id +
            ", adminId=" + adminId +
            ", recycleId=" + recycleId +
            ", data=" + data +
            ", dataTable=" + dataTable +
            ", connection=" + connection +
            ", primaryKey=" + primaryKey +
            ", isRestore=" + isRestore +
            ", ip=" + ip +
            ", useragent=" + useragent +
            ", createTime=" + createTime +
        "}";
    }
}
