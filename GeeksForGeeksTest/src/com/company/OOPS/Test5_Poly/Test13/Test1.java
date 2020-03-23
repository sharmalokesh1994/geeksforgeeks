package com.company.OOPS.Test5_Poly.Test13;

class A{
    int a = 10;

    void method(){
        System.out.println(a);
    }

}

class B extends A{
    int a = 20;
}

public class Test1 {

    public static void main(String[] args) {

        A a = new B();

        a.method();


    }

}
