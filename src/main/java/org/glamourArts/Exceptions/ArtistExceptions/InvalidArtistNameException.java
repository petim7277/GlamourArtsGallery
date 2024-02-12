package org.glamourArts.Exceptions.ArtistExceptions;

public class InvalidArtistNameException extends  RuntimeException{
    public InvalidArtistNameException (){
        super();
    }
    public InvalidArtistNameException (String message){
        super(message);
    }

    public InvalidArtistNameException (String message,Throwable cause){
        super(message, cause);
    }
}
