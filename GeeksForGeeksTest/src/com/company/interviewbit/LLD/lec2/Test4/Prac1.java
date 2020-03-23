package com.company.interviewbit.LLD.lec2.Test4;

import java.util.BitSet;

class Employee{

    private String name;
    private int id;
    private String des;
    private double salary;


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


        public Builder setDes(String des) {
            this.des = des;
            return this;
        }


        public Builder setSalary(double salary) {
            this.salary = salary;
            return this;
        }

        public Employee build(){

            return new Employee(this);
        }

    }


}

public class Prac1 {

    public static void main(String[] args) {

        Employee.Builder builder = new Employee.Builder("ABC",11).setDes("C1").setSalary(21000);
        Employee emp = builder.build();
    }

}
