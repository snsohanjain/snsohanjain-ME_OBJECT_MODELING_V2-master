package com.crio.jukebox.dtos;

public class UserCreationDto {
    String id;
    String name;

    public UserCreationDto(String id,String name) {
        this.id=id;
        this.name=name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
}
