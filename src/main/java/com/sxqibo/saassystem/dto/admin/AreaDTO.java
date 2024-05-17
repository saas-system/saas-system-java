package com.sxqibo.saassystem.dto.admin;

import java.io.Serializable;
import java.util.List;

/**
 * 区域数据传输对象
 */
public class AreaDTO implements Serializable {

    private static final long serialVersionUID = -6455780937345574724L;

    //城市编码
    private Integer code;

    //城市名称
    private String name;

    //子区域
    private List<AreaDTO> children;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AreaDTO> getChildren() {
        return children;
    }

    public void setChildren(List<AreaDTO> children) {
        this.children = children;
    }
}
