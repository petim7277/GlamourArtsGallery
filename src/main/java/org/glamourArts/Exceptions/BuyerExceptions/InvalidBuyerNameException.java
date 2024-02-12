package org.glamourArts.Exceptions.BuyerExceptions;

public class InvalidBuyerNameException extends  RuntimeException{
    public InvalidBuyerNameException (){
        super();
    }
    public InvalidBuyerNameException (String message){
        super(message);
    }

    public InvalidBuyerNameException (String message,Throwable cause){
        super(message, cause);
    }
}
