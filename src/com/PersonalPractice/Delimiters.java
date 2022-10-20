package com.PersonalPractice;

import java.util.Scanner;

public class Delimiters {
    //This program is the practice to understand about String Delimiter and tokens, splitting using Scanner.next()
    /*public static void main(String[] args) {
        String str = "Hello how are you! that's great to hear";
        Scanner sc = new Scanner(str);
        while(sc.hasNextLine()){
            String tokens = sc.next();
            System.out.println(tokens);
        }
    }*/
    //using split method
    public static void main(String[] args) {
        String str = "Hello,that',a,great,thing,to,know,that,you,are,too,beautiful";
        Scanner sc = new Scanner(str);
            String[] arr= sc.delimiter().split("thing");
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
    }
}
