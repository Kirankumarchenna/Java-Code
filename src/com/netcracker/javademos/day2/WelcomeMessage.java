package com.netcracker.javademos.day2;

public class WelcomeMessage{
    void printMessage(){
        System.out.println("Welcome Ali");
    }
}
class TestProgram {
    public static void main(String[] args) {
        WelcomeMessage wm = new WelcomeMessage();
        int count = 0;
        while(count<5){
            wm.printMessage();
            count++;
        }
    }
}
