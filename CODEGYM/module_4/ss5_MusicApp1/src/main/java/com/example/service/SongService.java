package com.example.service;

import com.example.model.Song;

import java.util.List;

public interface SongService {
    void save(Song song);
    void remove(int id);
    Song findById(int id);
    void update(int id, Song song);
    List<Song> findAll();
}
