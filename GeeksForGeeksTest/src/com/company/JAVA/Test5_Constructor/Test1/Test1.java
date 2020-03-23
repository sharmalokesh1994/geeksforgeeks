package com.company.JAVA.Test5_Constructor.Test1;


// we can create Constructor chaining
// one constructor should be without chaining
class A{

    A(){
        this(5);

        System.out.println("Default Constructor");
    }

    A(int a){
        this(5,10);
        System.out.println(a);
    }

    A(int a,int b){
        System.out.println(a+b);
    }

}


public class Test1 {

    public static void main(String[] args) {

        new A();

    }

}
