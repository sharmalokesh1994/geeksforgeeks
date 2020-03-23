package com.company.JAVA.Test5_Constructor.Test2;

class A{
    int a,b;

    A(int a,int b){
        this.a = a;
        this.b = b;
    }

    // this called copy constructor
    A(A a){
        this.a = a.a;
        this.b = a.b;
    }

}

public class Test1 {
}
