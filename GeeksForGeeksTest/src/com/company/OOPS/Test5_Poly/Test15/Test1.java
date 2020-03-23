package com.company.OOPS.Test5_Poly.Test15;

class A{
    int a = 15;

    static int b =25;
}

class B extends A{

}

public class Test1 {

    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.a);
        System.out.println(b.b);
    }

}
