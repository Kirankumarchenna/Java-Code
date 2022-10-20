package com.netcracker.javademos.day5.ExceptionHandling;

public class Demo {
  private final double value1;
  private final double value2;

    public Demo(double value1, double value2){
        this.value1 = value1;
        this.value2 = value2;
    }
    public double power() throws ArithmeticException {
        double pow = Math.pow(value1, value2);
        return pow;
    }
}
class DemoRun{
    public static void main(String[] args) {
        Demo demo = new Demo(0, 3);
        double pow = 0;
        try{
            pow = demo.power();
        }catch (ArithmeticException e){
            e.printStackTrace();
        }finally {
            System.out.println("Power of the given numbers: "+pow);
        }

    }
}

