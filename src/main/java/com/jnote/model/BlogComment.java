package com.jnote.model;

import java.util.Date;

public class BlogComment {
    private Integer id;

    private Integer blog_id;

    private Integer parent_comment_id;

    private Integer at_comment_id;

    private Integer member_id;

    private Integer at_member_id;

    private Date create_time;

    private Date update_time;

    private Byte status;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBlog_id() {
        return blog_id;
    }

    public void setBlog_id(Integer blog_id) {
        this.blog_id = blog_id;
    }

    public Integer getParent_comment_id() {
        return parent_comment_id;
    }

    public void setParent_comment_id(Integer parent_comment_id) {
        this.parent_comment_id = parent_comment_id;
    }

    public Integer getAt_comment_id() {
        return at_comment_id;
    }

    public void setAt_comment_id(Integer at_comment_id) {
        this.at_comment_id = at_comment_id;
    }

    public Integer getMember_id() {
        return member_id;
    }

    public void setMember_id(Integer member_id) {
        this.member_id = member_id;
    }

    public Integer getAt_member_id() {
        return at_member_id;
    }

    public void setAt_member_id(Integer at_member_id) {
        this.at_member_id = at_member_id;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}