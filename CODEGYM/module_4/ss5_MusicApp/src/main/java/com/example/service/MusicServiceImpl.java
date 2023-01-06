package com.example.service;

import com.example.model.Song;
import com.example.repository.MusicRepository;
import com.example.repository.MusicRepositoryImpl;

import java.util.List;

public class MusicServiceImpl implements MusicService{

    private final MusicRepository musicRepository = new MusicRepositoryImpl();

    @Override
    public List<Song> findAll() {
        return musicRepository.findAll();
    }

    @Override
    public Song findById(String id) {
        return musicRepository.findById(id);
    }

    @Override
    public void update(Song song) {
        musicRepository.update(song);
    }

    @Override
    public void save(Song song) {
        musicRepository.save(song);
    }
}
