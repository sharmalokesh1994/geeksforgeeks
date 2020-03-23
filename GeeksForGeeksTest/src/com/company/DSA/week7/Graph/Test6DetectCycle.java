package com.company.DSA.week7.Graph;

/*
****************************************************
Detect cycle in an undirected graph
* **************************************************
 */

/*
Given a undirected graph, the task is to complete the method isCyclic() to detect if there is a cycle in the undirected graph or not.
 */


import java.util.*;

public class Test6DetectCycle {

    static boolean isCyclic(ArrayList<ArrayList<Integer>> list, int V)
    {
        // add your code here

        boolean vis[] = new boolean[V];
        HashSet<Integer> hSet = new HashSet<>();
        boolean ans = false;
        for(int i=0;i<V;i++){
            if(vis[i]==false){
                if(isCyclic1(list,vis,hSet,i,-1)){
                    return true;
                }
            }
        }

        return ans;

    }



    static boolean isCyclic1(ArrayList<ArrayList<Integer>> list, boolean vis[], HashSet<Integer> hSet,int s,int par)
    {
        // add your code here

        if( hSet.contains(s) ){
            return true;
        }

        vis[s] = true;

        hSet.add(s);

        ArrayList<Integer> it = list.get(s);

        boolean ans = false;

        for(int a : it){
            if( a!=par){
                ans = ans || isCyclic1(list,vis,hSet,a,s);
                //System.out.println(a);
            }

        }
        return ans;

    }

}