package com.sxqibo.saassystem.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 钱包 - 钱包表
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
@TableName("tenant_wallet")
public class TenantWallet implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 账户ID
     */
    private Integer accountId;

    /**
     * 租户ID
     */
    private String tenantId;

    /**
     * 用户类型：U=用户,P=平台,A=租户
     */
    private String userType;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 账户余额
     */
    private BigDecimal balance;

    /**
     * 总收入金额
     */
    private BigDecimal incomeAmount;

    /**
     * 总支出金额
     */
    private BigDecimal outcomeAmount;

    /**
     * 冻结金额
     */
    private BigDecimal freezeAmount;

    /**
     * 钱包状态标志:1=正常,2=冻结
     */
    private Boolean status;

    /**
     * 添加时间
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
    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }
    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
    public BigDecimal getIncomeAmount() {
        return incomeAmount;
    }

    public void setIncomeAmount(BigDecimal incomeAmount) {
        this.incomeAmount = incomeAmount;
    }
    public BigDecimal getOutcomeAmount() {
        return outcomeAmount;
    }

    public void setOutcomeAmount(BigDecimal outcomeAmount) {
        this.outcomeAmount = outcomeAmount;
    }
    public BigDecimal getFreezeAmount() {
        return freezeAmount;
    }

    public void setFreezeAmount(BigDecimal freezeAmount) {
        this.freezeAmount = freezeAmount;
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
    public Long getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Long deleteTime) {
        this.deleteTime = deleteTime;
    }

    @Override
    public String toString() {
        return "TenantWallet{" +
            "id=" + id +
            ", accountId=" + accountId +
            ", tenantId=" + tenantId +
            ", userType=" + userType +
            ", userId=" + userId +
            ", balance=" + balance +
            ", incomeAmount=" + incomeAmount +
            ", outcomeAmount=" + outcomeAmount +
            ", freezeAmount=" + freezeAmount +
            ", status=" + status +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
            ", deleteTime=" + deleteTime +
        "}";
    }
}
