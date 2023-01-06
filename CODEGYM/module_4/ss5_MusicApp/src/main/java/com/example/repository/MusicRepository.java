package com.example.repository;

import com.example.model.Song;

import java.util.List;

public interface MusicRepository {
    List<Song> findAll();
    Song findById(String id);
    void update(Song song);
    void save(Song songs);
    void remove(String id);
}
