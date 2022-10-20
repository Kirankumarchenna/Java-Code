package com.PersonalPractice;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {3, 4, 6, 5, 2, 1};
        int min;
        int temp=0;
        for(int i=0;i<a.length;i++){
            min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        System.out.println("Array after selection sort: "+Arrays.toString(a));
    }
}
