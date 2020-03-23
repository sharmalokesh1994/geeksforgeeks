package com.company.JAVA.jvm.Test1;

// JVM Does not create object of Main method
// because abstract class can not have its instance

abstract class Main {

    static {
        System.out.println("Static block will be Initialized before Main method;");
        hello1();
    }

    // Main method should be there in JAVA code without main method your code will not compile
    public static void main(String[] args) {
        System.out.println("Main Method");
    }

    public static void hello(String[] args) {
        System.out.println("This will not be called by JVM");
    }

    public static void hello1() {
        System.out.println("This method will be called by JVM because it is used in static block");
    }

}
