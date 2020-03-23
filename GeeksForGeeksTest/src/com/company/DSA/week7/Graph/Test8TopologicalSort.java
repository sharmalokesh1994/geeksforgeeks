package com.company.DSA.week7.Graph;

/*
*****************************************************
Topological sort
* ***************************************************
 */

/*
Given a directed graph, you need to complete the function topoSort which returns an array having the topologically sorted elements of the array and takes two arguments. The first argument is the Graph graph represented as adjacency list and the second is the number of vertices N.
 */

import java.util.ArrayList;
import java.util.Stack;

public class Test8TopologicalSort {

    static int[] topoSort(ArrayList<ArrayList<Integer>> list, int N)
    {
        // add your code here

        boolean vis[] = new boolean[N];

        Stack<Integer> st = new Stack<>();

        for(int i=0;i<N;i++){

            if(vis[i] ==false ){
                myFunc(list,N,i,vis,st);
            }

        }

        int ans[] = new int[st.size()];

        int i=ans.length-1;

        while(!st.isEmpty() ){
            ans[i] = st.pop();
            i--;
        }

        return ans;

    }

    // It is for adding in Stack
    static void myFunc(ArrayList<ArrayList<Integer>> list, int N, int s, boolean vis[], Stack<Integer> st ){
        if(vis[s]==true ){
            return;
        }
        vis[s]=true;
        ArrayList<Integer> it = list.get(s);

        for(int a : it){
            myFunc(list,N,a,vis,st);
        }

        st.push(s);
    }
}
