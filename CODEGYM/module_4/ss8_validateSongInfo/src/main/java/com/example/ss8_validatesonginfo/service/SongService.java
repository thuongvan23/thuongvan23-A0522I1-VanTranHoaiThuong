package com.example.ss8_validatesonginfo.service;

import com.example.ss8_validatesonginfo.model.Song;

import java.util.List;

public interface SongService {
    List<Song> findAll();
    Song findById(Integer id);
    void save(Song song);
    void remove(Song song);
}
