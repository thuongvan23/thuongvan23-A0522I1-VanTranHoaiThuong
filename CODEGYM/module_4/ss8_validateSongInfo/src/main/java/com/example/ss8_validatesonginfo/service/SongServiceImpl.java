package com.example.ss8_validatesonginfo.service;

import com.example.ss8_validatesonginfo.model.Song;
import com.example.ss8_validatesonginfo.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceImpl implements SongService{
    @Autowired
    private SongRepository songRepository;

    @Override
    public List<Song> findAll() {
        return songRepository.findAll();
    }

    @Override
    public Song findById(Integer id) {
        return songRepository.findById(id).get();
    }

    @Override
    public void save(Song song) {
        songRepository.save(song);
    }

    @Override
    public void remove(Song song) {
        songRepository.delete(song);
    }
}
