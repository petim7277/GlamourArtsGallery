package org.glamourArts.Exceptions.ArtExceptions;

public class ArtExistException extends RuntimeException{
    public ArtExistException (){
        super();
    }
    public ArtExistException (String message){
        super(message);
    }

    public ArtExistException (String message,Throwable cause){
        super(message, cause);
    }
}
