package com.example.ss8_validatesonginfo.model;

import org.springframework.validation.annotation.Validated;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Song {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    @NotBlank
    @Size(max = 800)
    @Pattern(regexp = "^[a-zA-Z0-9\\s]+$")
    private String name;
    @Column(name = "path")
    private String path;
    @Column(name = "singer")
    @NotBlank
    @Size(max = 300)
    @Pattern(regexp = "^[a-zA-Z0-9\\s]+$")
    private String Singer;
    @Column(name = "type")
    @NotBlank
    @Size(max = 1000)
    @Pattern(regexp = "^[a-zA-Z0-9\\s,]+$")
    private String type;

    public Song() {
    }

    public Song(int id, String name, String path, String singer, String type) {
        this.id = id;
        this.name = name;
        this.path = path;
        Singer = singer;
        this.type = type;
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

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getSinger() {
        return Singer;
    }

    public void setSinger(String singer) {
        Singer = singer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
