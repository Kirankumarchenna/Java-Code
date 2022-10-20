package com.netcracker.javademos.day6;

public class ArrayCopyUsingSystem {
    public static void main(String[] args){
        int[] source = new int[]{34, 56, 23, 67, 98, 20};
        int[] destination = new int[4];

        System.arraycopy(source, 2, destination, 0, 4);
        System.out.println("After copy:");
        for(int num: destination){
            System.out.print(num + " ");
        }
    }
}
