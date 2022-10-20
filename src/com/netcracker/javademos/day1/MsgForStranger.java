package com.netcracker.javademos.day1;

class Stranger implements Runnable{
    private String message;
    public void setMessage(String message){
        this.message = message;
    }
    @Override
    public void run() {
        synchronized (this){
            for(char ch: message.toCharArray()){
                System.out.print(ch);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
        System.out.println();
    }
}
public class MsgForStranger {
    public static void main(String[] args) throws InterruptedException {
        Stranger bannerRunnable = new Stranger();
        bannerRunnable.setMessage("This is a secret message for you!!");
        Thread t1 = new Thread(bannerRunnable);
        t1.start();
        //t2.start();
    }
}

