package com.ccb.occ.cloud.entity;

import java.io.Serializable;

/**
 * @author Mr.hua
 * @version v1.0.0
 * @description
 * @date Created in 2019/8/30 14:56
 */
public class SysRole implements Serializable {
    static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

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
}
