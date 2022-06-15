package com.crio.jukebox.repsitories;

public class SongRepository {

    // private final Map<String,Song> songMap;
    // private Integer autoIncrement = 0;

    // public SongRepository(){
    //     songMap = new HashMap<String,Song>();
    // }

    // public SongRepository(Map<String, Song> songMap) {
    //     this.songMap = songMap;
    //     this.autoIncrement = songMap.size();
    // }

    // @Override
    // public Song save(Song entity) {
    //     if( entity.getId() == null ){
    //         autoIncrement++;
    //         Song q = new Song(Integer.toString(autoIncrement),entity.getTitle(),entity.getLevel(),entity.getScore());
    //         songMap.put(q.getId(),q);
    //         return q;
    //     }
    //     songMap.put(entity.getId(),entity);
    //     return entity;
    // }

    
    // @Override
    // public List<Song> findAll() {
    //     return songMap.values().stream().collect(Collectors.toList());
    // }

    // @Override
    // public Optional<Song> findById(String id) {
    //     return Optional.ofNullable(songMap.get(id));
    // }

    // @Override
    // public boolean existsById(String id) {
    //     // TODO Auto-generated method stub
    //     if(songMap.containsKey(id)) return true;
    //     return false;
    // }

    // @Override
    // public void delete(Song entity) {
    //     // TODO Auto-generated method stub
    //     if(songMap.containsKey(entity.getId())) songMap.remove(entity.getId());
    // }

    // @Override
    // public void deleteById(String id) {
    //     // TODO Auto-generated method stub
    //     if(songMap.containsKey(id)) songMap.remove(id);
    // }

    // @Override
    // public long count() {
    //     // TODO Auto-generated method stub
    //     return songMap.size();
    // }

   
    // @Override
    // public List<Song> findAllSongInsidePlaylist(String playlistId) {
    //     return songMap.values().stream().collect(Collectors.toList());
    // }
    
}
