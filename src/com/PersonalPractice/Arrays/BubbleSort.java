package com.PersonalPractice.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(6);
        System.out.println("List before sorting: "+list);
        Integer[] a = list.toArray(new Integer[0]);

        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    a[j]=a[j]+a[j+1];
                    a[j+1]=a[j]-a[j+1];
                    a[j] = a[j]-a[j+1];
                }
            }
        }
        List<Integer> list1 = new ArrayList<>(Arrays.asList(a));
        System.out.println("List after sorting: "+list1);

    }
}