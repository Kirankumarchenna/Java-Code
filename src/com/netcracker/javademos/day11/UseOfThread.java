package com.netcracker.javademos.day11;

public class UseOfThread {
    public static void main(String[] args) throws InterruptedException {
        String msg = "My Beautiful SweetHeart!";
        for(char ch: msg.toCharArray()){
            System.out.print(ch);
            Thread.sleep(1000);
        }
    }
}
