package com.example.repository;

import com.example.model.Song;

import javax.persistence.EntityTransaction;
import java.util.List;

public class SongRepositoryImpl implements SongRepository{

    @Override
public List<Song> findAll() {
        List<Song> songList = BaseRepository.entityManager.createQuery("select s from Song as s",Song.class).getResultList();
    return songList;
}

@Override
public void save(Song newSong) {
    EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
    entityTransaction.begin();
    BaseRepository.entityManager.persist(newSong);
    entityTransaction.commit();

}

@Override
public void remove(int id) {
    BaseRepository.entityManager.createQuery("delete from Song as s where s.songName = ?1", Song.class).setParameter(1,id).executeUpdate();

}

@Override
public Song findById(int id) {
    Song song;
    song = BaseRepository.entityManager.createQuery("select s from Song as s where s.songName = ?1", Song.class).setParameter(1,id).getSingleResult();
    return song;
}

    @Override
    public void update(int id, Song song) {

    }
}
