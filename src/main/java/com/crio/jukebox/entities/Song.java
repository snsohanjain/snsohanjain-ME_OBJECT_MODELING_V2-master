package com.crio.jukebox.entities;

public class Song extends BaseEntity{

    private final String name;
    private  String genre;
    private  String albumName;
    private  String albumArtist;

    public Song(Song song) {
        this(song.id,song.name,song.genre,song.albumName,song.albumArtist);
    }
    
    public Song(String id,String name,String genre,String albumName,String albumArtist) {
        this(name,genre,albumName,albumArtist);
        this.id=id;
    }

    public Song(String name,String genre,String albumName , String albumArtist) {
        this.name=name;
        this.genre=genre;
        this.albumName=albumName;
        this.albumArtist=albumArtist;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public String getAlbumName() {
        return albumName;
    }

    public String getAlbumArtist() {
        return albumArtist;
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
        Song other = (Song) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Song [id=" + id + ", name=" + name + ", genre=" + genre + ", albumName=" + albumName +", albumArtist="+ albumArtist+"]";
    }

    
}
