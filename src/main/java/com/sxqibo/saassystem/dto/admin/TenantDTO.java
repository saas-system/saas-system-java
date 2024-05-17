package com.sxqibo.saassystem.dto.admin;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sxqibo.saassystem.entity.Area;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 租户 - 租户信息表
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
public class TenantDTO implements Serializable
{

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private String id;

    /**
     * 租户名称
     */
    private String name;

    /**
     * 简称
     */
    private String shortName;

    /**
     * 站点logo
     */
    private String logo;

    /**
     * 联系人
     */
    @JsonProperty("contact_name")
    private String contactName;

    /**
     * 联系电话
     */
    private String mobile;

    /**
     * 省ID
     */
    private Integer provinceId;

    /**
     * 城市ID
     */
    private Integer cityId;

    /**
     * 区ID
     */
    private Integer districtId;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 状态:0=禁用,1=正常
     */
    private int status;

    /**
     * 备注
     */
    private String memo;

    @JsonProperty("area_ids")
    private List<Integer> areaIds;

    /**
     * 过期时间
     */
    @JsonProperty("expire_time")
    private String expireTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }
    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }
    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }
    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
    public String getExpireTime()
    {
        return expireTime;
    }

    public void setExpireTime(String expireTime)
    {
        this.expireTime = expireTime;
    }

    public List<Integer> getAreaIds()
    {
        areaIds.add(this.provinceId);
        areaIds.add(this.cityId);
        areaIds.add(this.districtId);

        return areaIds;
    }

    public void setAreaIds(List<Integer> areaIds)
    {
        this.provinceId = areaIds.get(0);
        this.cityId = areaIds.get(1);
        this.districtId = areaIds.get(2);

        this.areaIds = areaIds;
    }
}
