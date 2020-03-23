package com.company.JAVA.Test6_Thread.Test14;

import java.util.concurrent.*;

class A implements Callable<String> {

    String name = "";

    A(String name){
        this.name = name;
    }

    @Override
    public String call() throws Exception {

        System.out.println(name + " Started ... ");

        Thread.sleep(1000);

        System.out.println(name+" finished....");

        return name;
    }
}


public class Test1 {

    public static void main(String[] args) {

        A a1 = new A("A1");
        A a2 = new A("A2");
        A a3 = new A("A3");
        A a4 = new A("A4");

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<String> f1 = executorService.submit(a1);

        if(f1.isDone()){
            try {
                System.out.println(f1.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        Future<String> f2 = executorService.submit(a2);

        if(f2.isDone()){
            try {
                System.out.println(f2.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        Future<String> f3 = executorService.submit(a3);

        if(f3.isDone()){
            try {
                System.out.println(f3.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        Future<String> f4 = executorService.submit(a4);

        if(f4.isDone()){
            try {
                System.out.println(f4.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }



        executorService.shutdown();

    }

}
