package com.company.DSA.week7.Graph;

/*
************************************************
Level of Nodes
* **********************************************
 */

/*
Given an undirected graph of N edges and a node X is given. The task is to find the level of X. if X does not exist in the graph then print -1.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Test9Level_of_Nodes {

    static int levels(ArrayList<ArrayList<Integer>> list, int x, int in)
    {
        // add your code here

        int N = list.size();
        if(in>=N){
            return -1;
        }

        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[N];

        q.add(x);
        q.add(null);
        vis[x] = true;

        int ans=0;


        while(!q.isEmpty() ){
            Integer n = q.poll();
            if(n==null){
                ans++;

                if(q.isEmpty()){
                    break;
                }
                n = q.poll();
                q.add(null);
            }

            if(n==in){
                return ans;
            }


            ArrayList<Integer> it = list.get(n);

            for(Integer a : it){
                if(vis[a]==false ){
                    vis[a]=true;
                    q.add(a);
                }
            }


        }

        return 0;

    }



}
