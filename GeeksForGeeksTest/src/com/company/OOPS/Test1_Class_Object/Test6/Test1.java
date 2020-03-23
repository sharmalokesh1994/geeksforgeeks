package com.company.OOPS.Test1_Class_Object.Test6;

class A{
    int a = 0;
    A(int a){
        this.a = a;
    }

}

class B extends A{

    B(int a,int b){
        // without super it will give compile time error
        // if default consotructor is not written in super class
        super(a);
    }

}


class C{
    C(){

    }
}

class D extends C{
   // it will not give any issue
   // if we will not write super() constructor it will call bydefault
}

public class Test1 {

    public static void main(String[] args) {

    }

}
