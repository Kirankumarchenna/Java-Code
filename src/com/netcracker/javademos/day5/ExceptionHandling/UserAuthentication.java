package com.netcracker.javademos.day5.ExceptionHandling;

public class UserAuthentication {
    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        try{
            userRegistration.userDetails("Kannamma", 21, "India");
        }catch(InvalidAgeException|InvalidStateException e){
            System.out.println(e.getMessage());
        }
    }
}
