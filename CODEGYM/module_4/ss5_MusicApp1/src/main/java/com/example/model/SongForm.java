package com.example.model;

import org.springframework.web.multipart.MultipartFile;

public class SongForm {
    private int id;
    private String name;
    private String singer;
    private String type;
    private MultipartFile inputSong;

    public SongForm() {
    }

    public SongForm(int id, String name, String singer, String type) {
        this.id = id;
        this.name = name;
        this.singer = singer;
        this.type = type;
    }

    public SongForm(int id, String name, String singer, String type, MultipartFile inputSong) {
        this.id = id;
        this.name = name;
        this.singer = singer;
        this.type = type;
        this.inputSong = inputSong;
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

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public MultipartFile getInputSong() {
        return inputSong;
    }

    public void setInputSong(MultipartFile inputSong) {
        this.inputSong = inputSong;
    }
}
