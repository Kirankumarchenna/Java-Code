package com.netcracker.javademos.day11;

public class ATMThread extends Thread {

    private Account account;

    public void setAccount(Account account) {
        this.account = account;
    }

    public String j;
}
