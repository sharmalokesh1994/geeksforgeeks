package com.company.OOPS.Test5_Poly.Test1;

public class Test1 {

    public void methodA(){
        System.out.println("Prac Method 1");
    }

}


class Test2 extends  Test1{


    // Rub-time Polymorphism
    @Override
    public void methodA(){
        System.out.println("Test2 Method 2");
    }

    public void methodB(){
        System.out.println("Test2 MethodB 1");
    }

    // compile time polymorphism
    public void methodB(int a){
        System.out.println("Test2 MethodB 1 "+a);
    }

    public static void main(String[] args) {
        Test2 t = new Test2();

        t.methodA();
    }

}