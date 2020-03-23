package com.company.JAVA.Test6_Thread.Test11;

import java.util.concurrent.CountDownLatch;

//countdownLatch
class A implements Runnable{

    CountDownLatch countDownLatch;

    Thread t;

    A( CountDownLatch countDownLatch, String name ){

        this.countDownLatch = countDownLatch;

        t = new Thread(this,name);

        t.start();

    }


    @Override
    public void run() {


        System.out.println( Thread.currentThread().getName() +" started..." );

        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName() +" count :  "+ i);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println( Thread.currentThread().getName() +" finished..." );
        countDownLatch.countDown();

    }
}


public class Test1 {


    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(4);

        new A( countDownLatch,"A1" );
        new A( countDownLatch,"A2" );
        new A( countDownLatch,"A3" );
        new A( countDownLatch,"A4" );
        //new A( countDownLatch,"A5" );

        try {
            countDownLatch.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println( Thread.currentThread().getName() +" finished..." );

    }

}
