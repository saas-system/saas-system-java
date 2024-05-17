package com.sxqibo.saassystem.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 租户 - 配置表
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
@TableName("tenant_config")
public class TenantConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 租户ID
     */
    private String tenantId;

    /**
     * 微信小程序ID
     */
    private String miniAppId;

    /**
     * 微信小程序秘钥
     */
    private String miniSecretId;

    /**
     * 微信小程序logo
     */
    private String miniLogo;

    /**
     * 租户前缀
     */
    private String tenantPre;

    /**
     * 租户管理员前缀
     */
    private String adminPre;

    /**
     * 卡号生成前缀数字
     */
    private Integer numberPre;

    /**
     * 提醒管理员IDS
     */
    private String remindAdminIds;

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
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }
    public String getMiniAppId() {
        return miniAppId;
    }

    public void setMiniAppId(String miniAppId) {
        this.miniAppId = miniAppId;
    }
    public String getMiniSecretId() {
        return miniSecretId;
    }

    public void setMiniSecretId(String miniSecretId) {
        this.miniSecretId = miniSecretId;
    }
    public String getMiniLogo() {
        return miniLogo;
    }

    public void setMiniLogo(String miniLogo) {
        this.miniLogo = miniLogo;
    }
    public String getTenantPre() {
        return tenantPre;
    }

    public void setTenantPre(String tenantPre) {
        this.tenantPre = tenantPre;
    }
    public String getAdminPre() {
        return adminPre;
    }

    public void setAdminPre(String adminPre) {
        this.adminPre = adminPre;
    }
    public Integer getNumberPre() {
        return numberPre;
    }

    public void setNumberPre(Integer numberPre) {
        this.numberPre = numberPre;
    }
    public String getRemindAdminIds() {
        return remindAdminIds;
    }

    public void setRemindAdminIds(String remindAdminIds) {
        this.remindAdminIds = remindAdminIds;
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
        return "TenantConfig{" +
            "id=" + id +
            ", tenantId=" + tenantId +
            ", miniAppId=" + miniAppId +
            ", miniSecretId=" + miniSecretId +
            ", miniLogo=" + miniLogo +
            ", tenantPre=" + tenantPre +
            ", adminPre=" + adminPre +
            ", numberPre=" + numberPre +
            ", remindAdminIds=" + remindAdminIds +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
        "}";
    }
}
