package com.netcracker.javademos.day2;
import java.sql.SQLOutput;
import java.util.Scanner;
public class SwitchString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        String lang = sc.nextLine();
        switch(lang) {
            case "Hindi":
                System.out.println("The people from North India");
                break;
            case "Telugu":
                System.out.println("The people from South India");
        }
    }
}
