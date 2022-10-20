package com.netcracker.javademos.day3;

public class Pixel {
    private int xcord;
    private int ycord;
    private String Color;
    private static String DisplayType;

    static{
        System.out.println("Static Block");
        DisplayType = "LED";
    }
    {
        System.out.println("Instance Block");
    }
    Pixel(){
        System.out.println("Constructor");
    }
    public static String getDisplayType(){
        return DisplayType;
    }
    public void setXcord(int xCord){
        this.xcord = xCord;
    }
    public void setYcord(int ycord){
        this.ycord = ycord;
    }
    public void setColor(String color){
        int x = 10;
        DisplayType = "LCD";
        if("red".equals(color) || "blue".equals(color) || "green".equals(color)){
            this.Color = color;
        }
    }
    public String getColor(){
        return Color;
    }
    public String getPixel(){
        return "Pixel [x=" + xcord + ", y=" + ycord + "]";
    }
}
class PixelTest{
    public static void main (String[] args){
        System.out.println(Pixel.getDisplayType());
        Pixel p1 = new Pixel();
        p1.setXcord(100);
        p1.setYcord(150);
        Pixel p2 = new Pixel();
        p2.setColor("Green");
        p2.setXcord(250);
        p2.setYcord(350);
        p1.setColor("Red");
        System.out.println(p1.getPixel());
        System.out.println(p1.getColor());
        System.out.println(p2.getPixel());
        System.out.println(p2.getColor());
    }
}
