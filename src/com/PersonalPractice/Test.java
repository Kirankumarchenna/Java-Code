package com.PersonalPractice;

public class Test {
    String name = "SUV ";
    String runs(){
        return "generic speed";
    }
}
class car extends Test{
    String name = "Convertible";
    String runs(){
        return " faster speed";
    }
}
class maintenance{
    public static void main(String[] args) {
        new maintenance().go();
    }
    void go() {
        Test v = new car();
        System.out.println(v.name+v.runs());
    }
}
