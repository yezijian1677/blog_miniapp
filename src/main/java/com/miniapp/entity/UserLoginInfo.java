package com.miniapp.entity;

import java.util.Date;

public class UserLoginInfo {
    private Long id;

    private Integer userId;

    private Date date;

    private String ip;

    public UserLoginInfo(Long id, Integer userId, Date date, String ip) {
        this.id = id;
        this.userId = userId;
        this.date = date;
        this.ip = ip;
    }

    public UserLoginInfo() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }
}