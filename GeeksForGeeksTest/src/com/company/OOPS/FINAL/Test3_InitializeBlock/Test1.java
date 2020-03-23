package com.company.OOPS.FINAL.Test3_InitializeBlock;


// We can Initialize the value of final variable in Inialization block
class A{
    final int a;
    {
        // Initialize block will be called before object creation
        a = 5;
        System.out.println("Initialize block");
    }

    A(){
        System.out.println("Inside Constructor");
    }
}

public class Test1 {

    public static void main(String[] args) {

        A a = new A();


    }

}
