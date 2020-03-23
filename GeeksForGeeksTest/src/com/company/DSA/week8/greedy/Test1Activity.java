package com.company.DSA.week8.greedy;

import java.util.ArrayList;
import java.util.Collections;


/*
***************************************************
Activity Selection
* *************************************************
 */


/*
Given N activities with their start and finish times. Select the maximum number of activities that can be performed by a single person, assuming that a person can only work on a single activity at a time.

Note : The start time and end time of two activities may coincide.
 */

public class Test1Activity {
    static int activitySelection(int start[], int end[], int n)
    {
        // add your code here

        ArrayList<Time> time = new ArrayList<>();

        for(int i=0;i<n;i++){
            Time t = new Time();
            t.start = start[i];
            t.end = end[i];
            time.add(t);
        }

        Collections.sort(time);

        /*
        for(Time t : time){
            System.out.println(t.end);
        }*/

        int ans =1;
        int prvLast = time.get(0).end;

        for(int i=1;i<n;i++){
            int t = time.get(i).start;

            if(t>=prvLast){
                ans++;
                prvLast = time.get(i).end;
            }

        }

        return ans;


    }
}

class Time implements Comparable<Time>{

    int start=0;
    int end = 0;

    public int compareTo(Time t1){
        if(this.end>=t1.end){
            return 1;
        }else{
            return -1;
        }
    }

}