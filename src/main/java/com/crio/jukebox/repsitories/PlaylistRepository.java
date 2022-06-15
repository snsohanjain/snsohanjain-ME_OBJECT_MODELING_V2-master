package com.crio.jukebox.repsitories;

import java.util.HashMap;
import java.util.Map;

import com.crio.jukebox.entities.Playlist;

public class PlaylistRepository {

    private final Map<String,Playlist> playlistMap;
    private Integer autoIncrement = 0;

    
    
    public PlaylistRepository() {
        playlistMap = new HashMap<String,Playlist>();
    }

    public PlaylistRepository(Map<String, Playlist> playlistMap) {
        this.playlistMap = playlistMap;
        this.autoIncrement = playlistMap.size();
    }

    // @Override
    // public Contest save(Playlist entity) {
    //     if( entity.getId() == null ){
    //         autoIncrement++;
    //         Contest c = new Contest(Integer.toString(autoIncrement),entity.getName(),entity.getQuestions(),entity.getLevel(),entity.getCreator(),entity.getContestStatus());
    //         playlistMap.put(c.getId(),c);
    //         return c;
    //     }
    //     playlistMap.put(entity.getId(),entity);
    //     return entity;
    // }

    // @Override
    // public List<Playlist> findAll() {
    //  return playlistMap.values().stream().collect(Collectors.toList());
    // }

    // @Override
    // public Optional<Playlist> findById(String id) {
    //     return Optional.ofNullable(playlistMap.get(id));
    // }

    // @Override
    // public boolean existsById(String id) {
    //     if(playlistMap.containsKey(id)) return true;
    //     return false;
    // }

    // @Override
    // public void delete(Playlist entity) {
    //     // TODO Auto-generated method stub
    //     if(playlistMap.containsKey(entity.getId())) playlistMap.remove(entity.getId());
        
    // }

    // @Override
    // public void deleteById(String id) {
    //     // TODO Auto-generated method stub
    //     if(playlistMap.containsKey(id)) playlistMap.remove(id);
        
    // }

    // @Override
    // public long count() {
    //     // TODO Auto-generated method stub
    //     return playlistMap.size();
    // }

    // @Override
    // public List<Contest> findAllPlaylist() {
    //  return playlistMap.values().stream().collect(Collectors.toList());
    // }
    
}
