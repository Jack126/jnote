package com.jnote.model;

import java.util.Date;

public class JnoteProductDocContent {
    private Integer id;

    private Integer product_doc_id;

    private String version;

    private Integer updatedby_id;

    private Date create_time;

    private Date update_time;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProduct_doc_id() {
        return product_doc_id;
    }

    public void setProduct_doc_id(Integer product_doc_id) {
        this.product_doc_id = product_doc_id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}