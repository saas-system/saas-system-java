package com.sxqibo.saassystem.entity.tenant;

import com.baomidou.mybatisplus.annotation.*;
import com.sxqibo.saassystem.entity.admin.Tenant;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * <p>
 * 租户 - 管理员表
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
@TableName("tenant_admin")
public class TenantAdmin implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 租户ID
     */
    private String tenantId;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机
     */
    private String mobile;

    /**
     * 登录失败次数
     */
    private Integer loginFailure;

    /**
     * 登录时间
     */
    private Long lastLoginTime;

    /**
     * 登录IP
     */
    private String lastLoginIp;

    /**
     * 密码
     */
    private String password;

    /**
     * 密码盐
     */
    private String salt;

    /**
     * 签名
     */
    private String motto;

    /**
     * 状态:0=禁用,1=启用
     */
    private String status;

    /**
     * 是否平台管理员用户：0=否 1=是
     */
    private Boolean isPlatformAdmin;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Long createTime;

    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Long updateTime;

    @TableField(exist = false)
    private List<TenantAdminGroup> groups;

    @TableField(exist = false)
    private Long[] groupIds;

    @TableField(exist = false)
    private Tenant tenant;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public Integer getLoginFailure() {
        return loginFailure;
    }

    public void setLoginFailure(Integer loginFailure) {
        this.loginFailure = loginFailure;
    }
    public Long getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Long lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getSalt()
    {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public Boolean getIsPlatformAdmin() {
        return isPlatformAdmin;
    }

    public void setIsPlatformAdmin(Boolean isPlatformAdmin) {
        this.isPlatformAdmin = isPlatformAdmin;
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

    public Boolean getPlatformAdmin()
    {
        return isPlatformAdmin;
    }

    public void setPlatformAdmin(Boolean platformAdmin)
    {
        isPlatformAdmin = platformAdmin;
    }

    public List<TenantAdminGroup> getGroups()
    {
        return groups;
    }

    public void setGroups(List<TenantAdminGroup> groups)
    {
        this.groups = groups;
    }

    public Long[] getGroupIds()
    {
        return groupIds;
    }

    public void setGroupIds(Long[] groupIds)
    {
        this.groupIds = groupIds;
    }

    public Tenant getTenant()
    {
        return tenant;
    }

    public void setTenant(Tenant tenant)
    {
        this.tenant = tenant;
    }

    @Override
    public String toString()
    {
        return "TenantAdmin{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", tenantId='" + tenantId + '\'' +
                ", nickname='" + nickname + '\'' +
                ", avatar='" + avatar + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", loginFailure=" + loginFailure +
                ", lastLoginTime=" + lastLoginTime +
                ", lastLoginIp='" + lastLoginIp + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", motto='" + motto + '\'' +
                ", status='" + status + '\'' +
                ", isPlatformAdmin=" + isPlatformAdmin +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", groups=" + groups +
                ", groupIds=" + Arrays.toString(groupIds) +
                ", tenant=" + tenant +
                '}';
    }
}
