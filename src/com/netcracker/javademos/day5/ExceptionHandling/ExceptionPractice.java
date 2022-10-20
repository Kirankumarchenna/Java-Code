package com.netcracker.javademos.day5.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPractice {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter First number");
            int a = sc.nextInt();
            System.out.println("Enter Second number");
            int b = sc.nextInt();
            System.out.printf("Addition: %d + %d = %d\n", a, b, a + b);
            System.out.printf("Addition: %d - %d = %d\n", a, b, a - b);
            System.out.printf("Addition: %d * %d = %d\n", a, b, a * b);
            System.out.printf("Addition: %d / %d = %d\n", a, b, (double)a / b);
        }catch (ArithmeticException e){
            System.out.println("Cannot divide by zero: " + e.getMessage());
        }catch (InputMismatchException e){
            System.out.println("Entered Input is not valid: "+e.getMessage());
        }catch (Exception e){
            System.out.println("Some error occurred: "+ e.getMessage());
        }finally{
            System.out.println("Thank you for using code");
        }
    }
}
