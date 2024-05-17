package com.sxqibo.saassystem.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 租户 - 管理权限分组表
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
@TableName("tenant_admin_group_access")
public class TenantAdminGroupAccess implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 管理员ID
     */
    private Integer uid;

    /**
     * 租户ID
     */
    private String tenantId;

    /**
     * 分组ID
     */
    private Integer groupId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }
    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return "TenantAdminGroupAccess{" +
            "id=" + id +
            ", uid=" + uid +
            ", tenantId=" + tenantId +
            ", groupId=" + groupId +
        "}";
    }
}
