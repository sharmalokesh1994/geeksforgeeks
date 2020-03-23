package com.company.JAVA.jvm.Test1;

public class Main1 {


    static {
        System.out.println("Static block will be Initialized before Main method;");
        Main1 m1 = new Main1();
        m1.hello1();
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
    }

    public void hello1() {
        System.out.println("This method will be called by JVM because it is used in static block");
    }
}
