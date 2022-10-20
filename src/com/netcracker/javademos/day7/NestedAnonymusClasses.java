package com.netcracker.javademos.day7;

interface EmpInfo{
    void display();
}
public class NestedAnonymusClasses {
    public static void main(String[] args) {
        EmpInfo helloObject = new EmpInfo() {
            @Override
            public void display(){
                System.out.println("Hello from local Anonymus Class.");
            }
        };
        helloObject.display();

        EmpInfo greetObject = new EmpInfo() {
            @Override
            public void display() {
                System.out.println("Greetings from another Class");
            }
        };
        greetObject.display();
    }
}

