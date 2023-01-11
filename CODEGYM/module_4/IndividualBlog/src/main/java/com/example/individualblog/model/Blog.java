package com.example.individualblog.model;

import javax.persistence.*;

@Entity(name = "blog")
public class Blog {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "content")
    private String content;

    @OneToOne
    @JoinColumn(name = "id_category")
    private Category category;

    public Blog() {
    }

    public Blog(int id, String name, String content, Category category) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.category = category;
    }

    public Blog(String content) {
        this.content = content;
    }

    public Blog(String name, String content) {
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
