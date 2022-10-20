package com.netcracker.javademos.day5.ExceptionHandling;

public class ExceptionPractice2{
   public double Hello(int a, int b){
       double Div = 0;
       double Add = 0;
       try {
           Div = a / b;
           Add = a+b;
       }catch(ArithmeticException e){
           System.out.println("There is an Arithmetic Exception");
       }finally {
           return Div;
       }
   }
}
class handle{
    public static void main(String[] args) {
        ExceptionPractice2 exceptionPractice2 = new ExceptionPractice2();
        ExceptionPractice2 exceptionPractice3 = new ExceptionPractice2();
        System.out.println("Division: " + exceptionPractice2.Hello(23,2));
        System.out.println(exceptionPractice2);
        System.out.println("Equal: "+exceptionPractice2.equals(exceptionPractice3));
        System.out.println("Equal: "+exceptionPractice2.equals(exceptionPractice2));
        System.out.println("First Object: "+exceptionPractice2.hashCode());
        System.out.println("Second Object: "+exceptionPractice3.hashCode());
    }
}

