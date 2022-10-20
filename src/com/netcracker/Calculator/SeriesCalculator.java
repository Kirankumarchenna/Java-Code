package com.netcracker.Calculator;

public class SeriesCalculator {
    public int sum = 0;
    int calculatorSum(int a, int d, int n)
    {
        int count=0; int t=a;
        for(int i = 0; i<n;i++)
        {
            if(count==0){
                System.out.print(a);
                count++;
            }
            else{
                System.out.print(" + "+t);
            }
            t=t+d;
        }
        int sum=((n/2)*(2*a+(n-1)*d));
        System.out.print(" = ");
        return sum;
    }
    public static void main(String[] args) {
        SeriesCalculator sc = new SeriesCalculator();
        System.out.println(sc.calculatorSum(1,2,10));
    }
}