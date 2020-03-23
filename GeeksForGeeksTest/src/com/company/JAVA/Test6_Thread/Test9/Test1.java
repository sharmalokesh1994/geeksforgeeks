package com.company.JAVA.Test6_Thread.Test9;

class A{

    static synchronized void methodA()  {
        System.out.println("Inside class A");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        B.methodB();

        System.out.println("finish class A");
    }

}

class B{
    static synchronized void methodB()  {
        System.out.println("Inside class B");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        A.methodA();

        System.out.println("finish class B");
    }
}

class C implements Runnable{


    C(){
        new Thread(this).start();
    }



    @Override
    public void run() {
        A.methodA();
    }
}

class D implements Runnable{


    D(){
        new Thread(this).start();
    }



    @Override
    public void run() {
        B.methodB();
    }
}

public class Test1 {

    public static void main(String[] args) {
        new C();
        new D();
    }

}
