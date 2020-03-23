package com.company.java1_8.Teslusko.Test1;

interface A{
    default void method(){
        System.out.println("Inside A interface");
    }
}

interface B{
    default void method(){
        System.out.println("Inside B interface");
    }
}

interface C extends A,B{

    // We have to define method
    // because method is present in both the interface
    // Otherwise it will give error
    default void method(){
        System.out.println("Inside B interface");
    }
}

public class Prac1 implements A,B{

    // We have to define method
    // because method is present in both the interface
    // it should be public because in interface all the methods arre by-default public

    public void method(){
        A.super.method();
    }

    public static void main(String[] args) {
        new Prac1().method();
    }

}
