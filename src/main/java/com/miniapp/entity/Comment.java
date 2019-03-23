package com.miniapp.entity;

import java.util.Date;

public class Comment {
    private Long id;

    private Long articleId;

    private Date date;

    private String name;

    private String email;

    private String content;

    public Comment(Long id, Long articleId, Date date, String name, String email, String content) {
        this.id = id;
        this.articleId = articleId;
        this.date = date;
        this.name = name;
        this.email = email;
        this.content = content;
    }

    public Comment() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}