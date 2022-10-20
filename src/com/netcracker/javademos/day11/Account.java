package com.netcracker.javademos.day11;

public class Account {
    private Integer balance;

    public Account(){
        this.balance = balance;
    }
    public synchronized Integer deposit(Integer amount){
        System.out.printf("Depositing %d amount in your account", amount);
        balance+=amount;
        notify();
        return balance;
    }
    public synchronized Integer withdraw(Integer amount)throws InterruptedException{
        System.out.printf("Withdrawing %d amount from your account", amount);
        balance-=amount;
        wait();
        return balance;
    }

}
