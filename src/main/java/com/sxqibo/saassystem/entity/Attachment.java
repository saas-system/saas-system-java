package com.sxqibo.saassystem.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 公共 - 附件表
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
public class Attachment implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 细目
     */
    private String topic;

    /**
     * 租户ID，空为平台
     */
    private String tenantId;

    /**
     * 上传管理员ID
     */
    private Integer adminId;

    /**
     * 上传用户ID
     */
    private Integer userId;

    /**
     * 物理路径
     */
    private String url;

    /**
     * 宽度
     */
    private Integer width;

    /**
     * 高度
     */
    private Integer height;

    /**
     * 原始名称
     */
    private String name;

    /**
     * 大小
     */
    private Integer size;

    /**
     * mime类型
     */
    private String mimetype;

    /**
     * 上传(引用)次数
     */
    private Integer quote;

    /**
     * 存储方式
     */
    private String storage;

    /**
     * sha1编码
     */
    private String sha1;

    /**
     * 创建时间
     */
    private Long createTime;

    /**
     * 最后上传时间
     */
    private Long lastUploadTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }
    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
    public String getMimetype() {
        return mimetype;
    }

    public void setMimetype(String mimetype) {
        this.mimetype = mimetype;
    }
    public Integer getQuote() {
        return quote;
    }

    public void setQuote(Integer quote) {
        this.quote = quote;
    }
    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }
    public String getSha1() {
        return sha1;
    }

    public void setSha1(String sha1) {
        this.sha1 = sha1;
    }
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
    public Long getLastUploadTime() {
        return lastUploadTime;
    }

    public void setLastUploadTime(Long lastUploadTime) {
        this.lastUploadTime = lastUploadTime;
    }

    @Override
    public String toString() {
        return "Attachment{" +
            "id=" + id +
            ", topic=" + topic +
            ", tenantId=" + tenantId +
            ", adminId=" + adminId +
            ", userId=" + userId +
            ", url=" + url +
            ", width=" + width +
            ", height=" + height +
            ", name=" + name +
            ", size=" + size +
            ", mimetype=" + mimetype +
            ", quote=" + quote +
            ", storage=" + storage +
            ", sha1=" + sha1 +
            ", createTime=" + createTime +
            ", lastUploadTime=" + lastUploadTime +
        "}";
    }
}
