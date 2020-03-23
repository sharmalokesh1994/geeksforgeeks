package com.company.java1_8.Test2;


class A{
    public void methodA(){
        System.out.println("Hello");
    }
}

class B extends A{

    // if we will make this private it will give issue
    public void methodA(){
        System.out.println("Hello");
    }

}

public class Prac1 {
}
