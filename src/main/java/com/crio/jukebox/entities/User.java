package com.crio.jukebox.entities;

import java.util.List;
import java.util.stream.Collectors;

public class User extends BaseEntity {
    public final String name;
    private List<Playlist> playlists;

    public User(User user) {
        this(user.id, user.name, user.playlists);
    }

    public User(String id ,String name ,List<Playlist> playlists) {
        this(id,name);
        this.playlists=playlists;
    }

    public User(String id,String name) {
        this(name);
        this.id=id;
    }

    public User(String name) {
      this.name=name;
    }

    public String getName() {
        return name;
    }

    public List<Playlist> getPlaylists() {
        return playlists.stream().collect(Collectors.toList());
    }

    public void addPlaylist(Playlist playlist) {
        playlists.add(playlist);
    }

    public void deletePlayList(Playlist playlist) {
        playlists.removeIf(c -> c.getId()==playlist.getId());
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
        User other = (User) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", playlists=" + playlists + "]";
    }

}
