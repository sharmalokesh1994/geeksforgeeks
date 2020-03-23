package com.company.DSA.week8.backTracking.Test4;

/*
**********************************************
Combination Sum
* ********************************************
 */

/*
Given an array of integers A and a sum B, find all unique combinations in A where the sum is equal to B. The same repeated number may be chosen from A unlimited number of times.

Note:
        1. All numbers will be positive integers.
        2. Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
        3. The combinations themselves must be sorted in ascending order.
 */

import java.util.*;

public class Test4Sum {

    static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B)
    {
        // add your code here

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int n = A.size();

        HashSet<Integer> hSet = new HashSet<>();

        for(int i=0;i<n;i++){
            hSet.add(A.get(i) );
        }

        ArrayList<Integer> arr = new ArrayList<Integer>();

        for(int t : hSet){
            arr.add(t);
        }

        Collections.sort(arr);

        ArrayList<Integer> tempAns = new ArrayList<Integer>();


        finalAns(arr,tempAns,ans,arr.size(),0,B);


        return ans;


    }



    static void finalAns(ArrayList<Integer> arr,ArrayList<Integer> tempAns,ArrayList<ArrayList<Integer>> ans,int N,int start,int B){

        if(B<0){
            return;
        }
        if(B==0) {
            ans.add(tempAns);
            return;
        }

        for(int i=start;i<N;i++){
            int temp = B - arr.get(i);
            ArrayList<Integer> tempAns1 = new ArrayList<>();

            tempAns1 = (ArrayList) tempAns.clone();

            tempAns1.add(arr.get(i));
            finalAns(arr,tempAns1,ans,arr.size(),i,temp);
            //tempAns1.remove(tempAns1.size()-1);
        }

    }


}


