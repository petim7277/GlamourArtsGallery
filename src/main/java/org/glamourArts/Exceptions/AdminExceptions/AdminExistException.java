package org.glamourArts.Exceptions.AdminExceptions;

public class AdminExistException extends  RuntimeException{
    public AdminExistException ( ){
        super();
    }

    public AdminExistException (String message ){
        super(message);
    }

    public AdminExistException (String message ,Throwable cause){
        super(message, cause);
    }
}
