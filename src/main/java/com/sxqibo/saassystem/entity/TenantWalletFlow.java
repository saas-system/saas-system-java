package com.sxqibo.saassystem.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 钱包 - 流水表
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
@TableName("tenant_wallet_flow")
public class TenantWalletFlow implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 租户ID
     */
    private String tenantId;

    /**
     * 来源账户ID
     */
    private Integer fromAccountId;

    /**
     * 来源钱包ID
     */
    private Integer fromWalletId;

    /**
     * 去向账户ID
     */
    private Integer toAccountId;

    /**
     * 去向钱包ID
     */
    private Integer toWalletId;

    /**
     * 订单ID
     */
    private Integer orderId;

    /**
     * 订单号
     */
    private String orderNumber;

    /**
     * 订单类型model
     */
    private String orderType;

    /**
     * 来源用户类型:U=用户,P=平台,A=代理商
     */
    private String tradeFromUserType;

    /**
     * 来源用户ID
     */
    private String tradeFromUserId;

    /**
     * 来源用户名称
     */
    private String tradeFromUserName;

    /**
     * 去向用户类型:U=用户,P=平台,A=代理商
     */
    private String tradeToUserType;

    /**
     * 去向用户ID
     */
    private String tradeToUserId;

    /**
     * 去向用户名称
     */
    private String tradeToUserName;

    /**
     * 交易标题
     */
    private String tradeTitle;

    /**
     * 交易号
     */
    private String tradeNumber;

    /**
     * 交易金额
     */
    private BigDecimal tradeAmount;

    /**
     * 用户余额
     */
    private BigDecimal userBalance;

    /**
     * 租户余额
     */
    private BigDecimal tenantBalance;

    /**
     * 交易时间
     */
    private String tradeTime;

    /**
     * 交易json报文明细
     */
    private String tradeContent;

    /**
     * 业务类型
     */
    private Integer businessType;

    /**
     * 支付类型
     */
    private Boolean payType;

    /**
     * 备注
     */
    private String memo;

    /**
     * 扩展字段
     */
    private String extra;

    /**
     * 操作管理员ID
     */
    private Integer adminId;

    /**
     * 是否用户可见：0=否 1=是
     */
    private Boolean isUserVisible;

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
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }
    public Integer getFromAccountId() {
        return fromAccountId;
    }

    public void setFromAccountId(Integer fromAccountId) {
        this.fromAccountId = fromAccountId;
    }
    public Integer getFromWalletId() {
        return fromWalletId;
    }

    public void setFromWalletId(Integer fromWalletId) {
        this.fromWalletId = fromWalletId;
    }
    public Integer getToAccountId() {
        return toAccountId;
    }

    public void setToAccountId(Integer toAccountId) {
        this.toAccountId = toAccountId;
    }
    public Integer getToWalletId() {
        return toWalletId;
    }

    public void setToWalletId(Integer toWalletId) {
        this.toWalletId = toWalletId;
    }
    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }
    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }
    public String getTradeFromUserType() {
        return tradeFromUserType;
    }

    public void setTradeFromUserType(String tradeFromUserType) {
        this.tradeFromUserType = tradeFromUserType;
    }
    public String getTradeFromUserId() {
        return tradeFromUserId;
    }

    public void setTradeFromUserId(String tradeFromUserId) {
        this.tradeFromUserId = tradeFromUserId;
    }
    public String getTradeFromUserName() {
        return tradeFromUserName;
    }

    public void setTradeFromUserName(String tradeFromUserName) {
        this.tradeFromUserName = tradeFromUserName;
    }
    public String getTradeToUserType() {
        return tradeToUserType;
    }

    public void setTradeToUserType(String tradeToUserType) {
        this.tradeToUserType = tradeToUserType;
    }
    public String getTradeToUserId() {
        return tradeToUserId;
    }

    public void setTradeToUserId(String tradeToUserId) {
        this.tradeToUserId = tradeToUserId;
    }
    public String getTradeToUserName() {
        return tradeToUserName;
    }

    public void setTradeToUserName(String tradeToUserName) {
        this.tradeToUserName = tradeToUserName;
    }
    public String getTradeTitle() {
        return tradeTitle;
    }

    public void setTradeTitle(String tradeTitle) {
        this.tradeTitle = tradeTitle;
    }
    public String getTradeNumber() {
        return tradeNumber;
    }

    public void setTradeNumber(String tradeNumber) {
        this.tradeNumber = tradeNumber;
    }
    public BigDecimal getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(BigDecimal tradeAmount) {
        this.tradeAmount = tradeAmount;
    }
    public BigDecimal getUserBalance() {
        return userBalance;
    }

    public void setUserBalance(BigDecimal userBalance) {
        this.userBalance = userBalance;
    }
    public BigDecimal getTenantBalance() {
        return tenantBalance;
    }

    public void setTenantBalance(BigDecimal tenantBalance) {
        this.tenantBalance = tenantBalance;
    }
    public String getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(String tradeTime) {
        this.tradeTime = tradeTime;
    }
    public String getTradeContent() {
        return tradeContent;
    }

    public void setTradeContent(String tradeContent) {
        this.tradeContent = tradeContent;
    }
    public Integer getBusinessType() {
        return businessType;
    }

    public void setBusinessType(Integer businessType) {
        this.businessType = businessType;
    }
    public Boolean getPayType() {
        return payType;
    }

    public void setPayType(Boolean payType) {
        this.payType = payType;
    }
    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }
    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }
    public Boolean getIsUserVisible() {
        return isUserVisible;
    }

    public void setIsUserVisible(Boolean isUserVisible) {
        this.isUserVisible = isUserVisible;
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
        return "TenantWalletFlow{" +
            "id=" + id +
            ", userId=" + userId +
            ", tenantId=" + tenantId +
            ", fromAccountId=" + fromAccountId +
            ", fromWalletId=" + fromWalletId +
            ", toAccountId=" + toAccountId +
            ", toWalletId=" + toWalletId +
            ", orderId=" + orderId +
            ", orderNumber=" + orderNumber +
            ", orderType=" + orderType +
            ", tradeFromUserType=" + tradeFromUserType +
            ", tradeFromUserId=" + tradeFromUserId +
            ", tradeFromUserName=" + tradeFromUserName +
            ", tradeToUserType=" + tradeToUserType +
            ", tradeToUserId=" + tradeToUserId +
            ", tradeToUserName=" + tradeToUserName +
            ", tradeTitle=" + tradeTitle +
            ", tradeNumber=" + tradeNumber +
            ", tradeAmount=" + tradeAmount +
            ", userBalance=" + userBalance +
            ", tenantBalance=" + tenantBalance +
            ", tradeTime=" + tradeTime +
            ", tradeContent=" + tradeContent +
            ", businessType=" + businessType +
            ", payType=" + payType +
            ", memo=" + memo +
            ", extra=" + extra +
            ", adminId=" + adminId +
            ", isUserVisible=" + isUserVisible +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
            ", deleteTime=" + deleteTime +
        "}";
    }
}
