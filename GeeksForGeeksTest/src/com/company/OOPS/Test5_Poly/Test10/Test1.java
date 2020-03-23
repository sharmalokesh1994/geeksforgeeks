package com.company.OOPS.Test5_Poly.Test10;


//if a method is not present with same level of data-type than it will check higher family data-type

class A{

    long method( long a ){
        return a;
    }

}

public class Test1 {

    public static void main(String[] args) {
        A a = new A();

        int val = 5;
        System.out.println( a.method(val) );

    }

}
