package com.netcracker.javademos.day2;

public class MultiDimentionalArray {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];

        for(int row=0;row<matrix.length;row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = row * col;
            }
        }
        for(int row=0;row<matrix.length;row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
