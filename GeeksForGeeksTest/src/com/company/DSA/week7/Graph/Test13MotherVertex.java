package com.company.DSA.week7.Graph;

/*
***************************************************
Mother Vertex
* *************************************************
 */

/*
Find the Mother vertex in a directed graph. A mother vertex in a graph G = (V,E) is a vertex v such that all other vertices in G can be reached by a path from v.
 */


import java.util.ArrayList;
import java.util.Arrays;

public class Test13MotherVertex {
    static int findMother(ArrayList<ArrayList<Integer>> list, int n)
    {
        // add your code here

        boolean vis[] = new boolean[n];
        Arrays.fill(vis,false);

        int ans=0;

        for(int i=0;i<n;i++){


            if( vis[i]==false ){
                check(list,i,vis );
                ans=i;
            }
        }

        Arrays.fill(vis,false);

        check(list,ans,vis );

        for(int j=0;j<n;j++){
            if(vis[j]==false ){
                return -1;
            }
        }

        return ans;

    }

    public static void check(ArrayList<ArrayList<Integer>> list, int v,boolean vis[] ){
        if(vis[v]==true ){
            return;
        }

        vis[v] = true;

        ArrayList<Integer> it = list.get(v);

        for(int a : it){
            check(list,a,vis );
        }
    }

}
