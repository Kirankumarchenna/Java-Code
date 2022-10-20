package com.netcracker.javademos.day5.ExceptionHandling;

public class InvalidStateException extends Exception{

    public InvalidStateException() {
    }
    public InvalidStateException(String message) {
        super(message);
    }
    public InvalidStateException(String message, Throwable cause){
        super(message, cause);
    }
}
