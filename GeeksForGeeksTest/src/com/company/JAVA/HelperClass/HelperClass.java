package com.company.JAVA.HelperClass;


// HelperClass will have only static methods only
// It avoid programmers to write the same methods again and again
public class HelperClass {

    static int add(int a,int b){
        return a+b;
    }
}
class Test{
    public static void main(String[] args) {
        System.out.println(HelperClass.add(1,2));
    }
}
