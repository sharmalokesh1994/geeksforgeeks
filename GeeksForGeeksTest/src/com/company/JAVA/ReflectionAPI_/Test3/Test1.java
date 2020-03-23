package com.company.JAVA.ReflectionAPI_.Test3;

import java.lang.reflect.Method;

class A{


    public void methodA(int a){
        System.out.println( a );
    }

    public int methodB(int a){

        return a;
    }

}


public class Test1 {

    public static void main(String[] args) {

        A a = new A();

        Class a1 = a.getClass();

        // Getting methods of the class through the object
        // of the class by using getMethods

        Method methods[] = a1.getMethods();

        // Printing method names
        for (Method method:methods)
            System.out.println(method.getName());


        try {
            // creates object of desired method by providing the
            // method name and parameter class as arguments to
            // the getDeclaredMethod
            Method methodcall1 = a1.getDeclaredMethod( "methodA", int.class);

            methodcall1.invoke(a,10);

            Method methodcall2 = a1.getDeclaredMethod( "methodB", int.class);

            System.out.println(methodcall2.invoke(a,10));

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
