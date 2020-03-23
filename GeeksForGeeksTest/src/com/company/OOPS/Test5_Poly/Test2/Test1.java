package com.company.OOPS.Test5_Poly.Test2;

public class Test1 {

    public void methodA(){
        System.out.println("Prac Method 1");
        methodB();
    }

    public void methodB(){
        System.out.println("Prac MethodB 1");
    }

}


class Test2 extends Test1 {



    public void methodB(){
        System.out.println("Test2 MethodB 1");
    }

    // compile time polymorphism
    public void methodB(int a){
        System.out.println("Test2 MethodB 1 "+a);
    }

    public static void main(String[] args) {
        Test1 t = new Test2();

        t.methodA();
    }

}