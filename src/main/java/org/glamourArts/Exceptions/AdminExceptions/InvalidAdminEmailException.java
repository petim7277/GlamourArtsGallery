package org.glamourArts.Exceptions.AdminExceptions;

public class InvalidAdminEmailException extends  RuntimeException {
    public InvalidAdminEmailException ( ){
        super();
    }

    public InvalidAdminEmailException (String message ){
        super(message);
    }

    public InvalidAdminEmailException (String message ,Throwable cause){
        super(message, cause);
    }
}
