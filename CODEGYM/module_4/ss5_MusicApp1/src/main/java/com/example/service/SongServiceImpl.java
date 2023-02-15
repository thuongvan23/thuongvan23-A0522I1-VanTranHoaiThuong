package com.example.service;

import com.example.model.Song;
import com.example.repository.SongRepository;
import com.example.repository.SongRepositoryImpl;

import java.util.List;

public class SongServiceImpl implements SongService {

    private final SongRepository songRepository = new SongRepositoryImpl();

    @Override
    public void save(Song song) {
        songRepository.save(song);
    }

    @Override
    public void remove(int id) {
        songRepository.remove(id);
    }

    @Override
    public Song findById(int id) {
        return songRepository.findById(id);
    }

    @Override
    public void update(int id, Song song) {
        songRepository.update(id, song);
    }

    @Override
    public List<Song> findAll() {
        return songRepository.findAll();
    }
}
