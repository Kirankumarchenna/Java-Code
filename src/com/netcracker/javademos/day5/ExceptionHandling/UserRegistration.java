package com.netcracker.javademos.day5.ExceptionHandling;

public class UserRegistration {
    public void userDetails(String username, int age, String country) throws InvalidStateException, InvalidAgeException{
        if(!"India".equalsIgnoreCase(country)){
            throw new InvalidStateException("Outside State people cannot register");
        }
        if(age<18){
            throw new InvalidAgeException("You are minor");
        }
        System.out.printf("Thank you %s, from %s your registration is accepted", username, country);
    }
}
