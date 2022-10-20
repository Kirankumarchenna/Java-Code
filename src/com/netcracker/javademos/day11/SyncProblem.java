package com.netcracker.javademos.day11;

class BannerRunnable implements Runnable{

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
public class SyncProblem {
    public static void main(String[] args) throws InterruptedException {
        BannerRunnable bannerRunnable = new BannerRunnable();
        bannerRunnable.setMessage("The beautiful Wish to my strongest women a happy womens day :)");

        Thread t1 = new Thread(bannerRunnable);
        t1.start();
        //t2.start();
    }
}
