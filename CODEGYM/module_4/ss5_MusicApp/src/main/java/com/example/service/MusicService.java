package com.example.service;

import com.example.model.Song;

import java.util.List;

public interface MusicService {
    List<Song> findAll();
    Song findById(String id);
    void update(Song song);
    void save(Song songs);
}
