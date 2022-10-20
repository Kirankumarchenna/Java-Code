package com.netcracker.javademos.day3;

import java.util.Scanner;

interface LibraryUser{
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    String bookType = sc.next();
    String registerAccount();
    String requestBook();
}
class KidUsers implements LibraryUser {
    public String registerAccount(){
        String Message = null;
        if (age<12){
            Message = "You have successfully registered under Kids Account";
        }
        else if(age>12) {
            Message = "Sorry, Age must be less than 12 to register as kid";
        }
        return Message;
    }
    public String requestBook(){
        String Message2 = null;
        if(bookType=="Kid"){
            Message2 = "Book issued successfully, please return the book within 10 Days";
        }
        else{
            Message2 = "Oops you are not allowed to take, only Kids Books";
        }
        return Message2;
    }
}
class AdultUser implements LibraryUser{
    public String registerAccount(){
        String Message3 = null;
        if(age>12){
            Message3 = "You have successfully registered under an Adult Account";
        }
        else if(age<12){
            Message3 = "Sorry, Age must be greater than 12 to register an Adult Account";
        }
            return Message3;
    }
    public String requestBook(){
        String Message4 = null;
        if (bookType=="Adult"){
            Message4 = "Book issued successfully please return the book within 7 Days";
        }
        else{
            Message4 = "Oops you are not allowed to take only adult fiction books";
        }
            return Message4;
    }
}

class LibraryInterfaceDemo{
    public static void main(String[] args){
        KidUsers ku = new KidUsers();
        System.out.println(ku.registerAccount());
        System.out.println(ku.requestBook());
        AdultUser au = new AdultUser();
        System.out.println(au.registerAccount());
        System.out.println(au.requestBook());
    }
}