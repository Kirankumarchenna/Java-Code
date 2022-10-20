package com.netcracker.javademos.day2;
import java.util.Scanner;
public class kich1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 2 == 0){
            System.out.println("This number is Even");
        }else {
            System.out.println("This number is not an Even Number");
        }
    }
}
