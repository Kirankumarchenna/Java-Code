package com.netcracker.javademos.day5.ExceptionHandling;

public class InvalidAgeException extends Exception {

    public InvalidAgeException() {
    }
    public InvalidAgeException(String message) {
        super(message);
    }
    public InvalidAgeException(String message, Throwable cause){
        super(message, cause);
    }
}
