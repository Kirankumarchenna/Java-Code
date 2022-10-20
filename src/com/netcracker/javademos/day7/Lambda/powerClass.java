package com.netcracker.javademos.day7.Lambda;

interface power{
    int calculatePower(int x, int y);
}
/*public class powerClass implements power{
    public int calculatePower(int x, int y){
        return x+y;
    }
    public static void main(String[] args) {
        powerClass pc = new powerClass();
        System.out.println(pc.calculatePower(23, 2));
    }
}*/
public class powerClass{
    public static void main(String[] args) {
        power pow = new power(){
            public int calculatePower(int x, int y){
                return (int) Math.pow(x, y);
            }
        };
        power pow1 = (x, y) -> (int) Math.pow(x,y);
        System.out.println(pow.calculatePower(5,2));
        System.out.println(pow1.calculatePower(15,2));
    }
}
