package com.company.JAVA.Test6_Thread.Test3;

class A{

    void display(){

        System.out.print("[");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("]");
    }

}


class B implements Runnable{

    Thread t = null;
    A a = null;

    B( A a ){
        this.a = a;
        t = new Thread(this);

        t.start();
    }

    @Override
    public void run() {

        synchronized(a){
            a.display();
        }

    }
}

public class Test1 {

    public static void main(String[] args) {

        A a = new A();

        new B(a);
        new B(a);
        new B(a);

    }

}
