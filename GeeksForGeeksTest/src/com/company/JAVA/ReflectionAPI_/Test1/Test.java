package com.company.JAVA.ReflectionAPI_.Test1;

// Reflection APIs will help to work on unknown objects.
// By the help of Reflection APIs we can change the behaviour of the object and methods during runtime

class A{

    void method(){
        System.out.println("Hello");
    }

}

public class Test {


    public static void main(String[] args) {
        A a = new A();

        Class c1 = a.getClass();

        System.out.println(c1.getName());


    }
    // Reflection API's will be very slow in nature

}
