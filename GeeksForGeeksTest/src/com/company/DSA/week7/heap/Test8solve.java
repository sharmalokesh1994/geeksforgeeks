package com.company.DSA.week7.heap;

/*
************************************************
Minimum Cost of ropes
* **********************************************
 */

/*
There are given N ropes of different lengths, we need to connect these ropes into one rope. The cost to connect two ropes is equal to sum of their lengths. The task is to connect the ropes with minimum cost.
 */

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Test8solve {
    void minCost(int arr[], int n){
        // your code here

        if(n==1){
            System.out.println(arr[0]+" ");
            return;
        }
        if(n==2){
            System.out.println(arr[0]+arr[1]+" ");
            return ;
        }

        PriorityQueue<Long> p =new PriorityQueue<>();

        for(int i=0;i<n;i++){
            p.add((long)arr[i]);
        }

        long ans = 0;

        ArrayList<Long> list = new ArrayList<>();

        while( p.size()>1 ){
            long t1 = p.poll();
            long t2 = p.poll();
            ans = t1+t2;
            list.add(ans);

            p.add(ans);
        }

        ans = 0;

        for(int i=0;i<list.size();i++){
            //System.out.println(list.get(i));
            ans = ans+ list.get(i);
        }

        System.out.println(ans+" ");

    }
}
