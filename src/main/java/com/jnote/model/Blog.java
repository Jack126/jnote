package com.jnote.model;

import java.util.Date;

public class Blog {
    private Integer id;

    private String title;

    private String image;

    private String description;

    private String blog_category_id;

    private String tag_id;

    private Integer createdby_id;

    private Date create_time;

    private Date update_time;

    private Byte status;

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
        this.title = title == null ? null : title.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getBlog_category_id() {
        return blog_category_id;
    }

    public void setBlog_category_id(String blog_category_id) {
        this.blog_category_id = blog_category_id == null ? null : blog_category_id.trim();
    }

    public String getTag_id() {
        return tag_id;
    }

    public void setTag_id(String tag_id) {
        this.tag_id = tag_id == null ? null : tag_id.trim();
    }

    public Integer getCreatedby_id() {
        return createdby_id;
    }

    public void setCreatedby_id(Integer createdby_id) {
        this.createdby_id = createdby_id;
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