package com.miniapp.entity;

import java.util.Date;

public class Article {
    private Integer id;

    private String title;

    private String keywords;

    private String describle;

    private String pic;

    private Integer click;

    private Date time;

    private Integer catagoryId;

    private String content;

    public Article(Integer id, String title, String keywords, String describle, String pic, Integer click, Date time, Integer catagoryId, String content) {
        this.id = id;
        this.title = title;
        this.keywords = keywords;
        this.describle = describle;
        this.pic = pic;
        this.click = click;
        this.time = time;
        this.catagoryId = catagoryId;
        this.content = content;
    }

    public Article() {
        super();
    }

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

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public String getDescrible() {
        return describle;
    }

    public void setDescrible(String describle) {
        this.describle = describle == null ? null : describle.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public Integer getClick() {
        return click;
    }

    public void setClick(Integer click) {
        this.click = click;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getCatagoryId() {
        return catagoryId;
    }

    public void setCatagoryId(Integer catagoryId) {
        this.catagoryId = catagoryId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}