package com.netcracker.javademos.day7.Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class UsingQueue {
    public static void main(String[] args) {
        Queue<Integer> numbers = new PriorityQueue<>();
        numbers.add(10);
        numbers.offer(56);

        System.out.println(numbers);
        System.out.println("Head:" + numbers.peek());
        numbers.offer(98);
        System.out.println("Pool:" + numbers.poll());

        Queue<String> Alphabets = new PriorityQueue<>();
        Alphabets.offer("Chinthalli");
        Alphabets.offer("Naa Bangaram");
        Alphabets.offer("Kannamma");

        System.out.println(Alphabets);
        System.out.println("Head:" + Alphabets.peek());
    }
}