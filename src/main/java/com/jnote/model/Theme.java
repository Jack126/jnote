package com.jnote.model;

import java.util.Date;

public class Theme {
    private Integer id;

    private String name;

    private Date create_date;

    private Byte del_flag;

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
        this.name = name == null ? null : name.trim();
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Byte getDel_flag() {
        return del_flag;
    }

    public void setDel_flag(Byte del_flag) {
        this.del_flag = del_flag;
    }
}