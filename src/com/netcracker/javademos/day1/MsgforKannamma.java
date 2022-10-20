package com.netcracker.javademos.day1;

class Chinthalli implements Runnable{
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
public class MsgforKannamma {
    public static void main(String[] args) throws InterruptedException {
        Chinthalli bannerRunnable = new Chinthalli();
        bannerRunnable.setMessage("\"Hi Sweetheart a surprise message is waiting for you\" \n" +
                "\"A beautiful Wish to my strongest Lady a happy Womens day ;)\"" +
                " \n \n                      From your Shran :^");
        Thread t1 = new Thread(bannerRunnable);
        t1.start();
        //t2.start();
    }
}

