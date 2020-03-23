package com.company.DSA.week8.greedy.Test6;

import java.util.*;

/*
******************************************************
Job Sequencing Problem
* ****************************************************
 */


/*
Given a set of N jobs where each job i has a deadline and profit associated to it. Each job takes 1 unit of time to complete and only one job can be scheduled at a time. We earn the profit if and only if the job is completed by its deadline. The task is to find the maximum profit and the number of jobs done.
 */


public class Test6solve {
    void printJobScheduling(Job arr[], int n){
        // Your code here

        ArrayList<Job> aList = new ArrayList<>();

        for(int i=0;i<n;i++){
            aList.add(arr[i]);
        }

        Collections.sort(aList,new MyComparator());

        /*for(Job j1 : aList ){
            System.out.println(j1.profit);
        }*/

        int no = 0;
        int totalPro = 0;

        HashSet<Integer> hSet = new HashSet<>();

        for(Job j : aList){
            int deadline = j.deadline;

            while(deadline>0 ){
                if(!hSet.contains(deadline)){
                    hSet.add(deadline);
                    no++;
                    totalPro = totalPro + j.profit ;
                    break;
                }
                deadline--;

            }

        }

        System.out.print(no+" "+totalPro);

    }
}

class MyComparator implements Comparator<Job> {
    public int compare(Job j1,Job j2){

        if(j1.profit==j2.profit)
            return 0;
        else if(j1.profit>j2.profit)
            return -1;
        else
            return 1;

    }
}

class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z;
    }
}

