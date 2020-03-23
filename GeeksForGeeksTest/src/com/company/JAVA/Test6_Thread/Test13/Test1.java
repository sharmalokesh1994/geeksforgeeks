package com.company.JAVA.Test6_Thread.Test13;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

class A implements Runnable{


    String name;
    A(String name){
        this.name = name;
    }

    @Override
    public void run() {

        System.out.println(name+" Started...... ");

        for(int i=0; i<5;i++ ){
            System.out.println(name+" : "+i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        System.out.println(name+" Finished...... ");

    }
}

public class Test1 {

    public static void main(String[] args) {

        A a1 = new A("A1");
        A a2 = new A("A2");
        A a3 = new A("A3");
        A a4 = new A("A4");

        ExecutorService threadPoolExecutor = Executors.newFixedThreadPool(2);

        threadPoolExecutor.submit(a1);
        threadPoolExecutor.submit(a2);
        threadPoolExecutor.submit(a3);
        threadPoolExecutor.submit(a4);

        threadPoolExecutor.shutdown();

    }

}
