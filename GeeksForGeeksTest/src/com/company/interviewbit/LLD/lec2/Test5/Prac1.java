package com.company.interviewbit.LLD.lec2.Test5;

// stateful class

class Employee{

    // these define the state of the object
    private String name;
    private int id;
    private String des;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

// stateless classes
// These classes will be global classes
class TaxCalculation{

    // There are no state available so these classes will be called stateless classes
    // This method will be static so that it can be called by class-name
    static double tax( double salary ){

        return salary*10/100;

    }

}

public class Prac1 {

    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.setDes("C1");
        emp.setId(11);
        emp.setName("ABC");
        emp.setSalary(50000);

        double tax = TaxCalculation.tax(emp.getSalary());

        System.out.println(tax);

    }

}
