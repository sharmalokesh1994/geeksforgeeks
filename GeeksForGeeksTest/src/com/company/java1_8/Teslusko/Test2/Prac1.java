package com.company.java1_8.Teslusko.Test2;

interface A{
    default void method(){
        System.out.println("Inside A interface");
    }
}

class B{
    // It should be public to hide interface method
    // If it will not be public then we have to Override this in Prac1 class
    // because all the methods in interface are public by-default
    public void method(){
        System.out.println("Inside B interface");
    }
}

public class Prac1 extends B implements A {

    // here class has more priority than interface

    public static void main(String[] args) {
        new Prac1().method();
    }

}
