package com.company.OOPS.Test5_Poly.Test6;

interface Test{
    void method();
}

class A implements Test{

    @Override
    public void method() {
        System.out.println("In class A");
    }
}

public class Test1 extends A{
}
