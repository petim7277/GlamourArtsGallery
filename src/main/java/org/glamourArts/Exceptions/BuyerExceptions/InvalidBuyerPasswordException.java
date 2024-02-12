package org.glamourArts.Exceptions.BuyerExceptions;

public class InvalidBuyerPasswordException extends  RuntimeException{
    public InvalidBuyerPasswordException (){
        super();
    }
    public InvalidBuyerPasswordException (String message){
        super(message);
    }

    public InvalidBuyerPasswordException (String message,Throwable cause){
        super(message, cause);
    }
}
