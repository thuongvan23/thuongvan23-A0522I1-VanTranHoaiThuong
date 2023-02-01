package com.example.individualblog.model;


public class BlogForm {

    private int id;
    private String name;
    private String content;
    private int categoryId;

    public BlogForm() {
    }

    public BlogForm(int id, String name, String content, int categoryId) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.categoryId = categoryId;
    }

    public BlogForm (Blog blog){
        this.id = blog.getId();
        this.name = blog.getName();
        this.content = blog.getContent();
        this.categoryId = blog.getCategory().getId();
    }

    public BlogForm(String content) {
        this.content = content;
    }

    public BlogForm(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}

