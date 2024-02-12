package org.glamourArts.Exceptions.AdminExceptions;

public class InvalidAdminNameException extends  RuntimeException {
    public InvalidAdminNameException ( ){
        super();
    }

    public InvalidAdminNameException (String message ){
        super(message);
    }

    public InvalidAdminNameException (String message ,Throwable cause){
        super(message, cause);
    }
}
