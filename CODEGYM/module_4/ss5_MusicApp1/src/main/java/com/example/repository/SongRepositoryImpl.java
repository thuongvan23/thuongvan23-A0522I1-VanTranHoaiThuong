package com.example.repository;

import com.example.model.Song;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SongRepositoryImpl implements SongRepository{

    private final Map<Integer, Song> songMap = new HashMap<>();

    @Override
    public void save(Song song) {
        songMap.put(song.getId(), song);
    }

    @Override
    public void remove(int id) {
        songMap.remove(id);
    }

    @Override
    public Song findById(int id) {
        return songMap.get(id);
    }

    @Override
    public void update(int id, Song song) {
        songMap.put(id, song);
    }

    @Override
    public List<Song> findAll() {
        return new ArrayList<>(songMap.values());
    }

//    @Override
//public List<Song> getAll() {
//    List<Song> songList = BaseRepository.entityManager.createQuery("select s from Song as s",Song.class).getResultList();
//    return songList;
//}
//
//@Override
//public void save(Song newSong) {
//    EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
//    entityTransaction.begin();
//    BaseRepository.entityManager.persist(newSong);
//    entityTransaction.commit();
//
//}
//
//@Override
//public void delete(Song song) {
//    BaseRepository.entityManager.createQuery("delete from Song as s where s.songName = ?1", Song.class).setParameter(1,song.getSongName()).executeUpdate();
//}
//
//@Override
//public void delete(String nameSong) {
//    BaseRepository.entityManager.createQuery("delete from Song as s where s.songName = ?1", Song.class).setParameter(1,nameSong).executeUpdate();
//
//}
//
//@Override
//public Song findSongName(String songName) {
//    Song song;
//    song = BaseRepository.entityManager.createQuery("select s from Song as s where s.songName = ?1", Song.class).setParameter(1,songName).getSingleResult();
//    return song;
//}
}
