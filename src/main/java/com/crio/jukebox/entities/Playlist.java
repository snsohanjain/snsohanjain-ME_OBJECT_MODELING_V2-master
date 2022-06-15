package com.crio.jukebox.entities;

import java.util.List;
import java.util.stream.Collectors;

public class Playlist extends BaseEntity{

    private final String name;
    private final List<Song> songs;
    private final User creator;

    public Playlist(Playlist playlist) {
        this(playlist.id,playlist.name,playlist.creator,playlist.songs);
    }

    public Playlist(String id,String name , User creator, List<Song> songs) {
        this(name, creator, songs);
        this.id=id;
    }
    
    public Playlist(String name , User creator, List<Song> songs) {
        this.name=name;
        this.creator=creator;
        this.songs=songs;
    }

    public String getName() {
        return name;
    }

    public List<Song> getSongs() {
        return songs.stream().collect(Collectors.toList());
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void deleteSong(Song song) {
        songs.removeIf(c -> c.getId()==song.getId());
    }


    public User getCreator() {
        return creator;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Playlist other = (Playlist) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Playlist [id="+id+"creator=" + creator + ", name=" + name + ", songs=" + songs + "]";
    }

    
}
