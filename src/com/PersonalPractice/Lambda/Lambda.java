package com.PersonalPractice.Lambda;

import java.util.function.Function;
import java.util.function.Predicate;

public class Lambda {
    public static void main(String[] args) {
        Function<Integer, Integer> f = i->i*i;
        Predicate<Integer> p = i->i%2==0;
        Predicate<Integer> p1 = i -> i%2!=0;
        Function<Integer, Integer> f2 = i->i+7;
        System.out.println("Predicate Function: "+p.test(67));
        System.out.println("Normal Function: "+f.apply(90));
        System.out.println("Normal Function: "+f2.apply(21));
        System.out.println("Predicate Function: "+p1.test(90));
        Function<Integer, Boolean> S = i->i%2==0;
        System.out.println("Normal Function: "+S.apply(89));
    }
}
