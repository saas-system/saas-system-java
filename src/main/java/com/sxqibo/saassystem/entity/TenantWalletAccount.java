package com.sxqibo.saassystem.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 钱包 - 账户表
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
@TableName("tenant_wallet_account")
public class TenantWalletAccount implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 账户类型ID
     */
    private Integer accountTypeId;

    /**
     * 账户类型名称
     */
    private String accountTypeName;

    /**
     * 账户名称
     */
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getAccountTypeId() {
        return accountTypeId;
    }

    public void setAccountTypeId(Integer accountTypeId) {
        this.accountTypeId = accountTypeId;
    }
    public String getAccountTypeName() {
        return accountTypeName;
    }

    public void setAccountTypeName(String accountTypeName) {
        this.accountTypeName = accountTypeName;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TenantWalletAccount{" +
            "id=" + id +
            ", accountTypeId=" + accountTypeId +
            ", accountTypeName=" + accountTypeName +
            ", name=" + name +
        "}";
    }
}
