package com.company.java1_8.Teslusko.Test6;

// functional Interface

@FunctionalInterface
interface A{

    void method();

}

public class Prac1 {

    public static void main(String[] args) {


        // It will create new inner class file
        // outer variable should be final to access from inner class, similar to lambda methods
        A a = new A(){

            @Override
            public void method() {
                System.out.println("method a");
            }
        };

        a.method();

        A a1 = ()->{
            System.out.println("method a1");
        };


        a1.method();

        // if we have to write only one line then we can create lambda exp like below

        A a2 = ()-> System.out.println("mehtod a2");

        a2.method();

    }
}
