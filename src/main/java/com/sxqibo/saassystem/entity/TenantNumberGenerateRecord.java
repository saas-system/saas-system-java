package com.sxqibo.saassystem.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 编号记录生成表
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
@TableName("tenant_number_generate_record")
public class TenantNumberGenerateRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 单号类型
     */
    private String type;

    /**
     * 租户ID
     */
    private String tenantId;

    /**
     * 前缀
     */
    private String prefix;

    /**
     * 年
     */
    private String year;

    /**
     * 月
     */
    private String month;

    /**
     * 最后的数字
     */
    private Integer number;

    /**
     * 添加时间
     */
    private Long createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }
    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "TenantNumberGenerateRecord{" +
            "id=" + id +
            ", type=" + type +
            ", tenantId=" + tenantId +
            ", prefix=" + prefix +
            ", year=" + year +
            ", month=" + month +
            ", number=" + number +
            ", createTime=" + createTime +
        "}";
    }
}
