package com.netcracker.javademos.day3;

class Employee {
    public long employeeId;
    public String employeeName;
    public String employeeAddress;
     Long employeePhone;
    public double basicSalary;
    double specialAllowance = -250.80;
    double Hra = 1000.50;

    Employee(){
        System.out.println(this.employeeId);
        System.out.println(this.employeeName);
        System.out.println(this.employeeAddress);
        System.out.println(this.employeePhone);
    }
    public double calculateSalary(){
        return basicSalary + (basicSalary * specialAllowance/100) + (basicSalary * Hra/100);
    }
}
class Manager extends Employee{
    Manager(int id, String name, String address, long phone, double salary){
        System.out.println("Employee ID: "+(super.employeeId = id));
        System.out.println("Employee Name: "+(super.employeeName = name));
        System.out.println("Address: "+(super.employeeAddress = address));
        System.out.println("Phone: "+(super.employeePhone = phone));
        System.out.println("Salary: "+(super.basicSalary= salary));
    }
}
class Trainee extends Employee{
    Trainee(int id, String name, String address, long phone, double salary){
        System.out.println("Employee ID: "+(super.employeeId = id));
        System.out.println("Employee Name: "+(super.employeeName = name));
        System.out.println("Address: "+(super.employeeAddress = address));
        System.out.println("Phone: "+(super.employeePhone = phone));
        System.out.println("Salary: "+(super.basicSalary= salary));
    }
}
class InheritanceActivity{
    public static void main(String[] args){
        Employee employee = new Employee();
        System.out.println(employee.calculateSalary());
        Manager manager = new Manager(126534,"peter","Chennai india", 237844, 65000);
        System.out.println(manager.calculateSalary());
    }
}

