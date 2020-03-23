package com.company.JAVA.ReflectionAPI_.Test2;


// we can get the information about the class by class name as well
class A{

}

public class Test1 {

    public static void main(String[] args) {

        try {

            // We have to give full name of the class(Absolute path)
            Class c1 = Class.forName("com.company.JAVA.ReflectionAPI_.Test2.A");

            System.out.println(c1.getName());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
