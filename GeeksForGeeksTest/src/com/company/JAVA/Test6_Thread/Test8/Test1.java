package com.company.JAVA.Test6_Thread.Test8;

class Shue{
    int n = 0;

    boolean valueSet = false;

    synchronized void get(){

        if(valueSet){

            valueSet = false;
            System.out.println("Get : "+n);
            notify();
            try {
                wait();
            }catch (Exception e){

            }
        }


    }

    synchronized void put(){

        if(!valueSet){

            valueSet = true;
            n++;
            System.out.println("Put : "+n);
            notify();
            try {
                wait();
            }catch (Exception e){

            }
        }



    }

}

class Producer implements Runnable{

    Shue sh;

    Thread t;

    Producer( Shue sh ){
        this.sh = sh;
        t = new Thread(this, "Prod");
        t.start();
    }

    @Override
    public void run() {

        while(true){
            sh.put();
        }

    }
}

class Consumer implements Runnable{

    Shue sh;

    Thread t;

    Consumer( Shue sh ){
        this.sh = sh;
        t = new Thread(this, "Cons");
        t.start();
    }
    @Override
    public void run() {

        while(true){
            sh.get();
        }

    }
}

public class Test1 {

    public static void main(String[] args) {

        Shue sh = new Shue();

        new Producer(sh);
        new Consumer(sh);

    }

}
