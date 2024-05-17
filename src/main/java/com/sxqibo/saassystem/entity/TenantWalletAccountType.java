package com.sxqibo.saassystem.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 钱包 - 账户类型表
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
@TableName("tenant_wallet_account_type")
public class TenantWalletAccountType implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 账户类型
     */
    private String name;

    /**
     * 简称
     */
    private String memo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Override
    public String toString() {
        return "TenantWalletAccountType{" +
            "id=" + id +
            ", name=" + name +
            ", memo=" + memo +
        "}";
    }
}
