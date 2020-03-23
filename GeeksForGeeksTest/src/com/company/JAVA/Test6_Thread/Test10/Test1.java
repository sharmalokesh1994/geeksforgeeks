package com.company.JAVA.Test6_Thread.Test10;

import java.util.concurrent.Semaphore;

class A implements Runnable{

    Semaphore sem;
    Thread t;

    A(Semaphore sem, String name){

        t = new Thread( this,name);

        this.sem = sem;

        t.start();

    }


    @Override
    public void run() {


        try {
            sem.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println( Thread.currentThread().getName() +" started..." );

        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName() +" count :  "+ i);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        sem.release();

        System.out.println( Thread.currentThread().getName() +" finished..." );

    }
}

public class Test1 {

    public static void main(String[] args) {

        Semaphore sem = new Semaphore(3);

        new A(sem,"A1");
        new A(sem,"A2");
        new A(sem,"A3");
        new A(sem,"A4");
        new A(sem,"A5");

    }

}
