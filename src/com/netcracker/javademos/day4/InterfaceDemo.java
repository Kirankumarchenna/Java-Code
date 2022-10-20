package com.netcracker.javademos.day4;

interface DrawingShape{
    double PI = 34.80968;
    double calculateArea();
    double calculateVolume();
}
class drawingCircle implements DrawingShape{
    double Radius = 5.0;
    public double calculateArea(){
        return DrawingShape.PI*Radius*Radius;
    }
    public double calculateVolume(){
        return (4/3) * DrawingShape.PI * Radius * Radius * Radius;
    }
    public void Chinthalli(){
        System.out.println("Shran2231");
    }
}
class DrawingDemo{
    public static void main(String[] args){
        drawingCircle dc = new drawingCircle();
        System.out.println(dc.calculateArea());
        System.out.println(dc.calculateVolume());
        dc.Chinthalli();
    }
}