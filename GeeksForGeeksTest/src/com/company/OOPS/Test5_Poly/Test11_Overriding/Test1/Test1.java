package com.company.OOPS.Test5_Poly.Test11_Overriding.Test1;

class A{
    protected void method(){
        System.out.println("In child class, This method can be made public but we can not make it private");
    }
}

class B extends A{

    public void method(){
        System.out.println("Method is overriden");
        // we can use super key word to use parent method
        super.method();
    }
}

public class Test1 {

    public static void main(String[] args) {

        A a = new B();

        // run time polimorphism

        a.method();

    }

}
