package com.example.repository;

import com.example.model.Song;

import java.util.List;

public interface SongRepository {
    void save(Song song);
    void remove(int id);
    Song findById(int id);
    void update(int id, Song song);
    List<Song> findAll();
}
