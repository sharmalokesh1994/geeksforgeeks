package com.company.DSA.week7.Graph;

/*
**************************************
DFS of Graph
* ************************************
 */

/*
Given N nodes and E edges of a graph. The task is to do depth first traversal of the graph.
 */

import java.util.ArrayList;

public class Test3Traversal {

    static void dfs(int src, ArrayList<ArrayList<Integer>> list, boolean vis[])
    {
        // add your code here

        if(vis[src] ){
            return;
        }

        System.out.print(src+" ");
        vis[src] = true;

        ArrayList<Integer> it = list.get(src);

        for(int a: it){
            dfs(a,list,vis);
        }

    }
}
