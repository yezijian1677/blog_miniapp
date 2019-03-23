package com.miniapp.entity;

public class Category {
    private Integer id;

    private String name;

    private String keywords;

    private Boolean type;

    private String desc;

    public Category(Integer id, String name, String keywords, Boolean type, String desc) {
        this.id = id;
        this.name = name;
        this.keywords = keywords;
        this.type = type;
        this.desc = desc;
    }

    public Category() {
        super();
    }

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

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }
}