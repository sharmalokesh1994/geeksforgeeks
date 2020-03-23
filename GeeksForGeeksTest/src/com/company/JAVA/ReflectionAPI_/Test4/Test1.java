package com.company.JAVA.ReflectionAPI_.Test4;

import java.lang.reflect.Field;

// We can access private field and method as well
class A{
    private String s = "";
}

public class Test1 {

    public static void main(String[] args) {

        A a = new A();

        Class c1 = a.getClass();

        try {
            Field f1 = c1.getDeclaredField("s");
            f1.setAccessible(true);
            f1.set(a,"Hello");

            System.out.println(f1.get(a));


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
