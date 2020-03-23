package com.company.JAVA.ReflectionAPI_.Test5;

/*
In general, new operator is used to create objects,
 but if we want to decide type of object to be created at runtime,
 there is no way we can use new operator. In this case, we have to use newInstance() method.
 */

class A{

}

class B{

}

public class Test1 {

    static void fun( String s ){

        try {
            Object obj = Class.forName(s).newInstance();
            System.out.println(obj.getClass());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) {
        fun("com.company.JAVA.ReflectionAPI_.Test5.A");

        fun("com.company.JAVA.ReflectionAPI_.Test5.B");
    }

}
