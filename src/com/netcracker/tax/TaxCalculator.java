package com.netcracker.tax;
import java.util.Scanner;
public class TaxCalculator {
    Scanner sc = new Scanner(System.in);
    float basicSalary = sc.nextFloat();
    boolean citizenship = sc.nextBoolean();
    public void calculateTax(){
        float tax = 30*basicSalary/100;
        System.out.println("The Tax of the employee for the "+basicSalary + " is "+tax);
        this.deductTax(tax);
    }
    public void deductTax(float tax){
        int netSalary = (int)(basicSalary-tax);
        System.out.println("The net salary of the employee "+netSalary);
    }
    public void validateSalary() {
        boolean response = citizenship;
        if (basicSalary > 100000 && citizenship == true) {
            System.out.println("The Salary and citizenship eligibility: " + response);
        } else {
            System.out.println("The Salary and citizenship eligibility: " + response);
        }
    }
}
class EmployeeTax {
    public static void main(String[] args) {
        TaxCalculator tc = new TaxCalculator();
        tc.calculateTax();
        tc.validateSalary();
    }
}

