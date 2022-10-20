package com.netcracker.javademos.day2;

class TestProgram1{
    public static void main(String[] args) {
        WelcomeMessage wm = new WelcomeMessage();
        int count = 0;
        while(count<5){
            wm.printMessage();
            count++;
        }
    }
}
