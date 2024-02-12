package org.glamourArts.Exceptions.BuyerExceptions;

public class InvalidBuyerEmailException extends  RuntimeException{
    public InvalidBuyerEmailException (){
        super();
    }
    public InvalidBuyerEmailException (String message){
        super(message);
    }

    public InvalidBuyerEmailException (String message,Throwable cause){
        super(message, cause);
    }
}
