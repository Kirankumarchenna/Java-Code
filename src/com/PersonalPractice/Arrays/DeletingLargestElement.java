package com.PersonalPractice.Arrays;

import java.util.Collections;
import java.util.List;

public class DeletingLargestElement {
    public static void main(String[] args) {
        int[] a = {34, 56, 78, 98, 67};
        for (int i = 0; i<a.length;i++){
            for (int j = i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    a[i] = a[i]+a[j];
                    a[j] = a[i]-a[j];
                    a[i] = a[i]-a[j];
                }
            }
            int b = a.length;
            if(b==a[i]){
                for(int k=i; k<b;k++){
                    a[k] = a[k+1];
                }
                break;
            }
        }
        for (int i=0; i<a.length-1;i++){
            List<Integer> c = Collections.singletonList(a[i]);
            System.out.println(c);
        }
    }
}
