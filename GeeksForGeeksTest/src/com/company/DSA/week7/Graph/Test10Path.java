package com.company.DSA.week7.Graph;

/*
********************************************************
Possible paths between 2 vertices
* ******************************************************
 */

/*
Count the total number of ways or paths that exist between two vertices in a directed graph. These paths doesn’t contain a cycle.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Test10Path {

    static int countPaths(ArrayList<ArrayList<Integer>> list, int s, int d)
    {
        // add your code here

        int n = list.size();

        boolean vis[] = new boolean[n];
        Arrays.fill(vis,false);


        int ans =0;

        ans = countPaths(list,s,d,vis,ans);

        return ans;
    }


    static int countPaths(ArrayList<ArrayList<Integer>> list, int s, int d, boolean vis[], int ans )
    {
        // add your code here
        vis[s]=true;
        if(s==d){
            ans++;
        }else{
            ArrayList<Integer> it = list.get(s);

            for(int a : it){
                if(vis[a]==false){
                    ans = countPaths(list,a,d,vis,ans);
                }

            }
        }

        vis[s]=false;

        return ans;


    }




}
