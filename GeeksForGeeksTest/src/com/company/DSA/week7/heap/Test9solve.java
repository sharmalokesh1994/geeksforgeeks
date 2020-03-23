package com.company.DSA.week7.heap;

import java.util.PriorityQueue;

/*
********************************************
Nearly sorted
* ******************************************
 */

/*
Given an array of n elements, where each element is at most k away from its target position, you need to sort the array optimally.
 */

public class Test9solve {

    void nearlySorted(int arr[], int num, int k){
        // your code here

        PriorityQueue<Integer> p = new PriorityQueue<>();

        for(int i=0;i<=k;i++){
            p.add(arr[i]);
        }

        StringBuffer sb = new StringBuffer();

        for(int i=k+1;i<num;i++){
            int t = p.peek();
            if(t>arr[i]){
                sb.append(arr[i]+" ");
            }else{
                p.poll();
                p.add(arr[i]);
                sb.append(t+" ");
            }
        }

        while(!p.isEmpty()){
            int t = p.poll();
            sb.append(t+" ");
        }

        System.out.print(sb);

    }
}
