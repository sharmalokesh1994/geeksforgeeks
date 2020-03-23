package com.company.interviewbit.LLD.lec2.Test2;

class Employee{

    private String name;
    private int id;
    private String des;
    private double salary;


    // for initializing value while creating obj we need to create different constructor
    // If there will be more variables, no of constructor will increase exponential
    // If we create constructor with all the values, user need to remember the sequence
    // It is not scalable also
    // Suppose in future if we add one more variable than we have to change the constructor everywhere
    // This is against open/close principle


    public Employee(String name, int id, String des, double salary) {
        this.name = name;
        this.id = id;
        this.des = des;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDes() {
        return des;
    }

    public double getSalary() {
        return salary;
    }


    // Salary and designation of the employee can change
    public void setDes(String des) {
        this.des = des;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class Prac1 {

    public static void main(String[] args) {

        // All the values should be in sequence
        Employee emp = new Employee("A",11,"C1",45000);

    }

}
