package org.glamourArts.Exceptions.AdminExceptions;

public class InvalidAdminPasswordException extends  RuntimeException {
    public InvalidAdminPasswordException ( ){
        super();
    }

    public InvalidAdminPasswordException (String message ){
        super(message);
    }

    public InvalidAdminPasswordException (String message ,Throwable cause){
        super(message, cause);
    }
}
