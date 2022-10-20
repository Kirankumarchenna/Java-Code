package com.PersonalPractice.StreamsPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class forEach {
    public static void main(String[] args){
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(10);
        nums.add(89);
        nums.add(21);
        nums.add(43);
        nums.add(56);
        nums.add(32);
        System.out.println(nums);
        for(int num: nums){
            System.out.println(num);
        }
        nums.stream().forEach(System.out::println);
        Consumer<Integer> c = k -> {
            System.out.println("The Square of "+k+" is: "+(k*k));
        };
        nums.stream().forEach(c);
        System.out.println("-------------------------");
        nums.stream().sorted((i1, i2)-> (i1<i2)?-1: (i1>i2)?1:0).forEach(c);

        System.out.println("-------------------------");
        nums.stream().forEach(i->{
            System.out.println("The Square of "+i+" is: "+(i*i));
        });

        System.out.println("------------------------------------------------------------------");
        nums.stream().forEach(i->{
           System.out.println("Checking of even number: "+(i%2==0));
        });

        System.out.println("-----------Converting Stream of objects into array----------------");
        Integer[] k = nums.stream().toArray(Integer[]::new);
        for(Integer s: k ){
            System.out.println(s);
        }

        System.out.println("--Converting Stream of objects into array and array to stream-----");
        Integer[] s = nums.stream().sorted(Integer::compareTo).toArray(Integer[]::new);
        Stream.of(s).forEach(System.out::println);

        


    }
}
