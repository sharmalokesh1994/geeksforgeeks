package com.company.java1_8;

interface IP1{
    default void methodA(){
        System.out.println("Hello I am interface");
    }
}

public class Prac1 implements IP1{

    public void methodA(){
        IP1.super.methodA();
    }

    public static void main(String[] args) {

        Prac1 p = new Prac1();
        p.methodA();

    }
}
