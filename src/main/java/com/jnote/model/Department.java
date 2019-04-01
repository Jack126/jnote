package com.jnote.model;

import java.util.Date;

public class Department {
    private Integer id;

    private String name;

    private Integer createdby_id;

    private Integer updatedby_id;

    private Date create_time;

    private Date update_time;

    private Byte status;

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

    public Integer getCreatedby_id() {
        return createdby_id;
    }

    public void setCreatedby_id(Integer createdby_id) {
        this.createdby_id = createdby_id;
    }

    public Integer getUpdatedby_id() {
        return updatedby_id;
    }

    public void setUpdatedby_id(Integer updatedby_id) {
        this.updatedby_id = updatedby_id;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}