package com.sxqibo.saassystem.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 租户 - 管理员日志表
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
@TableName("tenant_admin_log")
public class TenantAdminLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 管理员ID
     */
    private Integer adminId;

    /**
     * 租户ID
     */
    private String tenantId;

    /**
     * 管理员用户名
     */
    private String username;

    /**
     * 操作Url
     */
    private String url;

    /**
     * 日志标题
     */
    private String title;

    /**
     * 请求数据
     */
    private String data;

    /**
     * IP
     */
    private String ip;

    /**
     * User-Agent
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
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
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
        return "TenantAdminLog{" +
            "id=" + id +
            ", adminId=" + adminId +
            ", tenantId=" + tenantId +
            ", username=" + username +
            ", url=" + url +
            ", title=" + title +
            ", data=" + data +
            ", ip=" + ip +
            ", useragent=" + useragent +
            ", createTime=" + createTime +
        "}";
    }
}
