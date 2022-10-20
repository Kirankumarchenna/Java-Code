package com.netcracker.tax;

class EmployeeTax1 {
    public static void main(String[] args) {
        TaxCalculator tc = new TaxCalculator();
        tc.calculateTax();
       // tc.deductTax();
        tc.validateSalary();
    }
}
