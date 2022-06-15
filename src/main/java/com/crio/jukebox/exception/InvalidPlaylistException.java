package com.crio.jukebox.exception;

public class InvalidPlaylistException extends RuntimeException{

    public InvalidPlaylistException(){
        super();
    }

    public InvalidPlaylistException(String msg) {
        super(msg);
    }

    
}
