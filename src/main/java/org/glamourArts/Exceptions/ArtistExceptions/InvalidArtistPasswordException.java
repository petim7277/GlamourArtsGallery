package org.glamourArts.Exceptions.ArtistExceptions;

public class InvalidArtistPasswordException extends RuntimeException{
    public InvalidArtistPasswordException (){
        super();
    }
    public InvalidArtistPasswordException (String message){
        super(message);
    }

    public InvalidArtistPasswordException (String message,Throwable cause){
        super(message, cause);
    }
}
