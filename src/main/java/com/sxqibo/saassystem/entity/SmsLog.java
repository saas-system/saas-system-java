package com.sxqibo.saassystem.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 公共 -短信发送记录表
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
@TableName("sms_log")
public class SmsLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 标题
     */
    private String title;

    /**
     * 模版ID
     */
    private Integer templateId;

    /**
     * 关联的租户ID
     */
    private String tenantId;

    /**
     * 发送手机号
     */
    private String mobile;

    /**
     * 唯一标识
     */
    private String code;

    /**
     * 服务商模板ID
     */
    private String template;

    /**
     * 短信内容
     */
    private String content;

    /**
     * 短信变量内容
     */
    private String data;

    /**
     * 状态:0=未发送,1=发送成功 2=发送失败
     */
    private Boolean status;

    /**
     * 备注
     */
    private String memo;

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
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
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
        return "SmsLog{" +
            "id=" + id +
            ", title=" + title +
            ", templateId=" + templateId +
            ", tenantId=" + tenantId +
            ", mobile=" + mobile +
            ", code=" + code +
            ", template=" + template +
            ", content=" + content +
            ", data=" + data +
            ", status=" + status +
            ", memo=" + memo +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
        "}";
    }
}
