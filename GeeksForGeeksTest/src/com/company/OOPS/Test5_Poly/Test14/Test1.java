package com.company.OOPS.Test5_Poly.Test14;

class A{

}

class B extends A{

}

public class Test1 {

    public static void main(String[] args) {
        B b = new B();

        // true
        System.out.println( b instanceof A );

        // true
        System.out.println( b instanceof Object );

    }

}
