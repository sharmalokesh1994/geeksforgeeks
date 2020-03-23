package com.company.DSA.week7.Graph;

/*
******************************************************
Detect cycle in a directed graph
* ****************************************************
 */

/*
Given a directed graph, the task is to complete the method isCyclic() to detect if there is a cycle in the graph or not. You should not read any input from stdin/console. There are multiple test cases. For each test case, this method will be called individually.
 */

import java.util.*;

public class Test5DetectCycle {
    static boolean isCyclic(ArrayList<ArrayList<Integer>> list, int V)
    {
        // add your code here

        boolean vis[] = new boolean[V];
        HashSet<Integer> hSet = new HashSet<>();
        boolean ans = false;
        for(int i=0;i<V;i++){
            if(vis[i]==false){
                if(isCyclic1(list,vis,hSet,i)){
                    return true;
                }
            }
        }

        return ans;

    }

    static boolean isCyclic1(ArrayList<ArrayList<Integer>> list, boolean vis[], HashSet<Integer> hSet,int s)
    {
        // add your code here

        if( hSet.contains(s) ){
            return true;
        }

        if(vis[s]==true ){
            return false;
        }


        vis[s] = true;

        hSet.add(s);

        ArrayList<Integer> it = list.get(s);

        boolean ans = false;

        for(int a : it){
            ans = ans || isCyclic1(list,vis,hSet,a);
        }

        hSet.remove(s);

        return ans;

    }

}