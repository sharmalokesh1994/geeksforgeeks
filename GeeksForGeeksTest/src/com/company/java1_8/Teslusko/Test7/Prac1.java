package com.company.java1_8.Teslusko.Test7;

@FunctionalInterface
interface A{

    void method(int a);

}

public class Prac1 {

    public static void main(String[] args) {


        // It will create new inner class file
        // outer variable should be final to access from inner class, similar to lambda methods
        A a = new A(){

            @Override
            public void method(int a) {
                System.out.println("method a "+a);
            }
        };

        a.method(5);

        // we can write int or not also
        A a1 = (int val)->{
            System.out.println("method a1 ");
        };

        a1.method(5);

        // if we have to write only one variable then we can create lambda exp like below

        A a2 = (int b)-> System.out.println("mehtod a2");

        a2.method(5);

        a2 = (b)-> System.out.println("mehtod a2");

        a2.method(5);


        // We can use ans but can not modify
        int ans = 0;
        a1 = (int val)->{
            System.out.println("method a1 ");
            // a2 can not be called here because a2 is var
            a.method(ans);
        };

        a1.method(5);


    }
}
