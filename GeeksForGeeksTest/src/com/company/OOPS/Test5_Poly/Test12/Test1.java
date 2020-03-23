package com.company.OOPS.Test5_Poly.Test12;

class A{
    // Only method will be Overriden
    int a = 10;
}

class B extends A{
    int a =20;
}

public class Test1 {

    public static void main(String[] args) {
        A a = new B();

        System.out.println( a.a );
        //output will be 10

    }

}
