package com.netcracker.javademos.day2;
import java.util.Scanner;
public class NumberCheck {
    public void displayBigNumber(){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int max = 0;
        if(num1>num2 && num1>num3){
            max=num1;
        }else if(num2>num1 && num2>num3){
            max=num2;
        }else if(num3>num1 && num3>num2){
            max=num3;
        }
        System.out.println(max+" is the Biggest Number.");
    }
}
class MainProgram{
    public static void main(String[] args) {
        NumberCheck nc = new NumberCheck();
        nc.displayBigNumber();
    }
}
