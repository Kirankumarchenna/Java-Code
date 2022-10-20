package com.PersonalPractice;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> data = new LinkedHashSet<>();
        data.add("Hello");
        data.add("Hi");
        data.add("Hello");
        data.add("hie");
        data.add("Hello");
        System.out.println(data);
    }
}
