package com.example.ss8_validatesonginfo.repository;

import com.example.ss8_validatesonginfo.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface SongRepository extends JpaRepository<Song, Integer> {
}
