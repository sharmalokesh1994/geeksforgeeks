package com.company.JAVA.jvm.Test2;


public class Test {

    // v is called final blank variable
    // Value of v can be assigned by constructor only
    // for every object v may be different
    final int v;
    Test(int v){
        this.v = v;
    }
}

class Test2 {

    // v is called final static blank variable
    // Value of v can be assigned by static block only
    // v will be same all the time
    final static  int v;
    static {
        v = 5;
    }

}

class Test1{
    public static void main(String[] args) {
        Test t1 = new Test(5);
        Test t2 = new Test(6);

        System.out.println(t1.v);
        System.out.println(t2.v);


    }
}
