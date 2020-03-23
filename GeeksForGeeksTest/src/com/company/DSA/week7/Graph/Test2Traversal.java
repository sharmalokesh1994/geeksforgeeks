package com.company.DSA.week7.Graph;

/*
*********************************************
BFS of graph
* *******************************************
 */
/*
Given N and E, the number of nodes and edges in a directed graph. The task is to do Breadth First Search of this graph.
 */

import java.util.*;

public class Test2Traversal {
    static void bfs(int s, ArrayList<ArrayList<Integer>> list, boolean vis[])
    {
        Queue<Integer> q = new LinkedList<>();

        vis[s] = true;
        q.add(s);

        while(!q.isEmpty()){

            int t = q.poll();

            System.out.print(t+" ");

            Iterator<Integer> it = list.get(t).iterator();

            while(it.hasNext()){
                int n = it.next();
                if(vis[n]==false){
                    vis[n]=true;
                    q.add(n);
                }

            }


        }

    }



}
