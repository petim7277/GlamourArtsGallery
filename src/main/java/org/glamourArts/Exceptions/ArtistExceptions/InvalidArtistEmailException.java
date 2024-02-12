package org.glamourArts.Exceptions.ArtistExceptions;

public class InvalidArtistEmailException extends RuntimeException{
    public InvalidArtistEmailException (){
        super();
    }
    public InvalidArtistEmailException (String message){
        super(message);
    }

    public InvalidArtistEmailException (String message,Throwable cause){
        super(message, cause);
    }
}
