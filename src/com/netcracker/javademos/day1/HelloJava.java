package com.netcracker.javademos.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

class Student{
    int rollNo;
    static String name;
    public Student(int rollNo){
        this.rollNo = rollNo;
        name = name;
    }
}
public class HelloJava {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        Scanner sc = new Scanner(System.in);
        for (Student i : list) {
            System.out.println("Enter Roll No & name: ");
            list.add(new Student(sc.nextInt()));
        }
        Stream<Student> filteredData = list.stream().filter(s -> s.rollNo == 32);
        filteredData.forEach(System.out::println);
    }
}