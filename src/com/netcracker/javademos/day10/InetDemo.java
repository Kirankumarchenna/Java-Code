package com.netcracker.javademos.day10;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetDemo {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress local = InetAddress.getLocalHost();
        System.out.println(local);
    }
}
