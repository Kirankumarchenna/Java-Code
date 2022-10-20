package com.netcracker.javademos.day5;

public class StringsDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb);
        sb.insert(sb.indexOf("Hello")+5, "_Java");
        System.out.println(sb);
        sb.setCharAt(sb.indexOf("_"), ' ');
        System.out.println(sb);
        System.out.println(sb.charAt(6));
        sb.deleteCharAt(3);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
    }
}
