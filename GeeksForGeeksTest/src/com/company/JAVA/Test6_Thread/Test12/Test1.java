package com.company.JAVA.Test6_Thread.Test12;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

// CyclicBarrier is very similar to Mumbai-Pune cab Service
// Cab will start when 4-Passenger will arrive

class Passenger implements Runnable{

    CyclicBarrier cb;
    Thread t;

    int dur=0;

    Passenger( CyclicBarrier cb, String name,int dur ){

        this.cb = cb;

        this.dur = dur;
        t = new Thread(this,name);
        t.start();

    }

    @Override
    public void run() {



        try {

            Thread.sleep(dur);
            System.out.println( t.getName()+" reached " );


            int await = cb.await();


            if(await==0){
                // Car will start when CyclicBarrier will break
                System.out.println("Cab Started");

            }

            //System.out.println( t.getName()+" finished " );

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }

    }
}

public class Test1 {

    public static void main(String[] args) {

        CyclicBarrier cb = new CyclicBarrier(4);

        new Passenger(cb,"P1",1000);
        new Passenger(cb,"P2",2000);
        new Passenger(cb,"P3",3000);
        new Passenger(cb,"P4",4000);

        // When CyclicBarrier breaks it will reset its value

        new Passenger(cb,"P5",5000);
        new Passenger(cb,"P6",6000);
        new Passenger(cb,"P7",7000);
        new Passenger(cb,"P8",8000);


    }

}
