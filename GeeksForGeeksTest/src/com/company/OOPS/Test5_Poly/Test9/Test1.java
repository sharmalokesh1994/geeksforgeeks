package com.company.OOPS.Test5_Poly.Test9;

class A1{
    static void method(){
        System.out.println("A1");

    }
    void method1(){
        method();
        System.out.println("A1");
    }

}

class B1 extends A1{
    static void method(){

        System.out.println("B1");
    }

}

public class Test1 {

    public static void main(String[] args) {
        A1 a = new B1();
        // It will call method A1
        a.method1();

        B1 b1 = new B1();
        // It will call method A1

        b1.method1();

    }

}