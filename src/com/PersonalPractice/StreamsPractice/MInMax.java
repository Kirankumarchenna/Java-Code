package com.PersonalPractice.StreamsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class MInMax {
    public static void main(String[] args){
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(10);
        myList.add(20);
        myList.add(40);
        myList.add(32);
        myList.add(54);
        myList.add(11);
        myList.add(15);
        List<Integer> list = Arrays.asList(10, 20, 30, 40);
        int minimum = list.stream().min((i1, i2) ->-i1.compareTo(i2)).get();
        System.out.println(minimum);
        System.out.println("Initial List: "+myList);
        int min = myList.stream().min((i1, i2)->-i1.compareTo(i2)).get();
        System.out.println("Minimum value: "+min);
        int max = myList.stream().max((i1, i2)->-i1.compareTo(i2)).get();
        System.out.println("Maximum value: "+max);
    }
}