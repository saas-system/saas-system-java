package com.sxqibo.saassystem.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 平台 - 系统配置
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
@TableName("platform_config")
public class PlatformConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 变量名
     */
    private String name;

    /**
     * 分组
     */
    private String group;

    /**
     * 变量标题
     */
    private String title;

    /**
     * 变量描述
     */
    private String tip;

    /**
     * 类型:string,number,radio,checkbox,switch,textarea,array,datetime,date,select,selects
     */
    private String type;

    /**
     * 变量值
     */
    private String value;

    /**
     * 字典数据
     */
    private String content;

    /**
     * 验证规则
     */
    private String rule;

    /**
     * 扩展属性
     */
    private String extend;

    /**
     * 允许删除:0=否,1=是
     */
    private Boolean allowDel;

    /**
     * 权重
     */
    private Integer weigh;

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
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }
    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }
    public Boolean getAllowDel() {
        return allowDel;
    }

    public void setAllowDel(Boolean allowDel) {
        this.allowDel = allowDel;
    }
    public Integer getWeigh() {
        return weigh;
    }

    public void setWeigh(Integer weigh) {
        this.weigh = weigh;
    }

    @Override
    public String toString() {
        return "PlatformConfig{" +
            "id=" + id +
            ", name=" + name +
            ", group=" + group +
            ", title=" + title +
            ", tip=" + tip +
            ", type=" + type +
            ", value=" + value +
            ", content=" + content +
            ", rule=" + rule +
            ", extend=" + extend +
            ", allowDel=" + allowDel +
            ", weigh=" + weigh +
        "}";
    }
}
