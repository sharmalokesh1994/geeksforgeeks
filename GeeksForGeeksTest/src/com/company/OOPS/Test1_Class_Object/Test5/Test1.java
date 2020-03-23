package com.company.OOPS.Test1_Class_Object.Test5;

// Top level class can not be static
class A{

    static class staticA{

        void method(){
            System.out.println("static class");
        }

    }

    class staticB{
        void method(){
            System.out.println("non-static class");
        }
    }

}

public class Test1 {

    public static void main(String[] args) {

        A.staticA a1 = new A.staticA();

        A a = new A();

        // for non-static class we have to create object of parent
        A.staticB a2 = a.new staticB();
        a1.method();
        a2.method();

    }

}
