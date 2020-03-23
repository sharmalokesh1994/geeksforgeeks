package com.company.java1_8.Teslusko;

@FunctionalInterface
interface A{
    void print();
}

class B{
    void printvalue( A a ){
        a.print();
    }
}

class C{
    static void printC(){
        System.out.println("It will print");
    }

    void printC1(){
        System.out.println("It will print");
    }
}

public class Prac1 {


    public static void main(String[] args) {
        A a = C::printC;

        B b = new B();
        b.printvalue(a);

        b.printvalue( new C()::printC1);

    }

}
