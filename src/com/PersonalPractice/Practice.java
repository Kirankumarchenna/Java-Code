package com.PersonalPractice;

import java.util.Random;

import static java.lang.Math.max;
import static java.lang.Math.sqrt;

public class Practice {
    public static void main(String[] args){
        System.out.println("Random: "+ new Random().nextInt());
        System.out.println("Double: "+ new Random().nextDouble());
        System.out.println("String: "+ new Random());
        System.out.println("HashCode: "+ new Random().hashCode());
        System.out.println("Longs: "+ new Random().longs());
        System.out.println("Float: "+ new Random().nextFloat());
        System.out.println("Max: "+ max(23,5));
        System.out.println("Power: "+(int)Math.pow(23,3));
        System.out.println("Sqare root: "+sqrt(23));
        System.out.println();
        System.out.println(new Random().nextInt());
           int a = 20;
           int b = 46;
        /*a=a+b;
        b=a-b;
        a=a-b;*/
          a=a+(b=b-a);
           System.out.println(a + " " + b);

    }
}
