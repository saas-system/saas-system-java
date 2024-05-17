package com.sxqibo.saassystem.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 租户 - 用户表
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
@TableName("tenant_user")
public class TenantUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 租户ID
     */
    private String tenantId;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 性别:0=未知,1=男,2=女
     */
    private Boolean gender;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 身份证
     */
    private String idCard;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 国家
     */
    private String country;

    /**
     * 地址
     */
    private String address;

    /**
     * 参赛积分
     */
    private Integer integral;

    /**
     * 竞技点
     */
    private Integer competitivePoint;

    /**
     * 大师分
     */
    private Integer masterScore;

    /**
     * 卡券数量
     */
    private Integer couponNum;

    /**
     * 是否虚拟用户:0=否,1=是
     */
    private Boolean isVirtual;

    /**
     * 状态标志:0=禁用,1=正常
     */
    private Boolean status;

    /**
     * 最后登录IP
     */
    private String lastLoginIp;

    /**
     * 最后登录时间
     */
    private Long lastLoginTime;

    /**
     * 最后登录地址
     */
    private String lastLoginIpAddr;

    /**
     * 注册时IP
     */
    private String registerIp;

    /**
     * 注册来源:1=Android,2=iPhone,3=模拟器
     */
    private Boolean registerOrigin;

    /**
     * 注册地址
     */
    private String registerIpAddr;

    /**
     * 手机型号
     */
    private String model;

    /**
     * 平台类型：
     */
    private String platform;

    /**
     * 平台ID
     */
    private String openid;

    /**
     * 第三方扩展字段
     */
    private String extra;

    /**
     * 授权用:session_key
     */
    private String sessionKey;

    /**
     * 创建时间
     */
    private Long createTime;

    /**
     * 修改时间
     */
    private Long updateTime;

    /**
     * 删除时间
     */
    private Long deleteTime;

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
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }
    public Integer getCompetitivePoint() {
        return competitivePoint;
    }

    public void setCompetitivePoint(Integer competitivePoint) {
        this.competitivePoint = competitivePoint;
    }
    public Integer getMasterScore() {
        return masterScore;
    }

    public void setMasterScore(Integer masterScore) {
        this.masterScore = masterScore;
    }
    public Integer getCouponNum() {
        return couponNum;
    }

    public void setCouponNum(Integer couponNum) {
        this.couponNum = couponNum;
    }
    public Boolean getIsVirtual() {
        return isVirtual;
    }

    public void setIsVirtual(Boolean isVirtual) {
        this.isVirtual = isVirtual;
    }
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }
    public Long getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Long lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
    public String getLastLoginIpAddr() {
        return lastLoginIpAddr;
    }

    public void setLastLoginIpAddr(String lastLoginIpAddr) {
        this.lastLoginIpAddr = lastLoginIpAddr;
    }
    public String getRegisterIp() {
        return registerIp;
    }

    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp;
    }
    public Boolean getRegisterOrigin() {
        return registerOrigin;
    }

    public void setRegisterOrigin(Boolean registerOrigin) {
        this.registerOrigin = registerOrigin;
    }
    public String getRegisterIpAddr() {
        return registerIpAddr;
    }

    public void setRegisterIpAddr(String registerIpAddr) {
        this.registerIpAddr = registerIpAddr;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }
    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }
    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
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
    public Long getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Long deleteTime) {
        this.deleteTime = deleteTime;
    }

    @Override
    public String toString() {
        return "TenantUser{" +
            "id=" + id +
            ", tenantId=" + tenantId +
            ", nickname=" + nickname +
            ", realName=" + realName +
            ", gender=" + gender +
            ", mobile=" + mobile +
            ", idCard=" + idCard +
            ", avatar=" + avatar +
            ", country=" + country +
            ", address=" + address +
            ", integral=" + integral +
            ", competitivePoint=" + competitivePoint +
            ", masterScore=" + masterScore +
            ", couponNum=" + couponNum +
            ", isVirtual=" + isVirtual +
            ", status=" + status +
            ", lastLoginIp=" + lastLoginIp +
            ", lastLoginTime=" + lastLoginTime +
            ", lastLoginIpAddr=" + lastLoginIpAddr +
            ", registerIp=" + registerIp +
            ", registerOrigin=" + registerOrigin +
            ", registerIpAddr=" + registerIpAddr +
            ", model=" + model +
            ", platform=" + platform +
            ", openid=" + openid +
            ", extra=" + extra +
            ", sessionKey=" + sessionKey +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
            ", deleteTime=" + deleteTime +
        "}";
    }
}
