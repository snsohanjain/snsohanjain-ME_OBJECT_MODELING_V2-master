package com.crio.jukebox.repsitories;

import java.util.List;

import com.crio.jukebox.entities.Song;

public interface ISongRepository extends CRUDRepository<Song, String> {

    public List<Song> findAllSongInsidePlaylist(String playlistId);
    
}