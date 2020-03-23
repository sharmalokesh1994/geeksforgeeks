package com.company.java1_8.Teslusko.Test4;

interface A{

    // static method will not be inharited
    static void method(){
        System.out.println("Inside A");
    }

}

interface B{

    static void method(){
        System.out.println("Inside A");
    }

}

public class Prac1 implements A,B{

    public static void main(String[] args) {
        A.method();
    }

}
