package com.PersonalPractice.StreamsPractice;

import java.util.*;
import java.util.stream.Collectors;

public class ComparatorSorting{
    public static void main(String[] args){
        List<String> customers = new ArrayList<>();
        customers.add("Rajini");
        customers.add("Kiran");
        customers.add("Raju");
        customers.add("Sujatha");
        customers.add("Sagar");
        System.out.println("Initial List: "+customers);
        List<String> ppl = Arrays.asList("Sudarshana", "Kiran", "Shareef");
        System.out.println("Collected information: "+ppl.stream().sorted().collect(Collectors.toList()));
        System.out.println("Filtered a person: "+ppl.stream().filter(Shu -> Shu ==  "Sudarshana").collect(Collectors.toList()));
        System.out.println("Filtered a person with equals: "+ppl.stream().filter(Sha -> Objects.equals(Sha,"Shareef")).collect(Collectors.toList()));
        Comparator<String> cm = (s1, s2)->{
            int i1 = s1.length();
            int i2 = s2.length();
            if(i1<i2) return -1;
            else if(i1>i2) return +1;
            else return s1.compareTo(s2);
        };
        List<String> list = customers.stream().sorted(cm).collect(Collectors.toList());
        System.out.println("List after sorted: "+list);
    }
}
