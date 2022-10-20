package com.netcracker.javademos.day7;

public enum Vehicles {
    bike,
    Car,
    Bus,
    Truck,
    Rikshaw
}

class ParkingLotTest{
    public static void main(String[] args) {
        Vehicles vehicles = Vehicles.Car;
        double charges = calculateFare(vehicles, 11);
        System.out.println(charges);
    }
    public static double calculateFare(Vehicles vehicle, int hours){
        double amountToPay = 0;
        switch (vehicle){
            case bike: amountToPay = 10 * hours; break;
            case Rikshaw: amountToPay = 15 * hours; break;
            case Car: amountToPay = 25 * hours; break;
            case Truck: amountToPay = 30 * hours;break;
        }
        return amountToPay;
    }
}