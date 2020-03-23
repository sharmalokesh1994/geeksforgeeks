package com.company.interviewbit.LLD.lec2.Test3;

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

    // To solve this problem we will use builder class pattern as well


    private Employee( Builder builder ) {
        this.name = builder.name;
        this.id = builder.id;
        this.des = builder.des;
        this.salary = builder.salary;
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


    static class Builder{

        // Same variable as Employee class

        private String name;
        private int id;
        private String des;
        private double salary;

        // Two mandatory parameter
        public Builder(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }


        public void setDes(String des) {
            this.des = des;
        }


        public void setSalary(double salary) {
            this.salary = salary;
        }

        public Employee build(){

            return new Employee(this);
        }

    }


}

public class Prac1 {

    public static void main(String[] args) {

        Employee.Builder builder = new Employee.Builder("ABC",11);
        // to write all these things in line we can make some change in builder class
        builder.setDes("C1");
        builder.setSalary(21000);

        Employee emp = builder.build();
    }

}
