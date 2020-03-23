package com.company.DSA.week8.backTracking.Test6;

import java.util.List;

/*
************************************************
* M-Coloring Problem
* **********************************************
 */

/*
Given an undirected graph and an integer M. The task is to determine if the graph can be colored with at most M colors such that no two adjacent vertices of the graph are colored with the same color. Here coloring of a graph means assignment of colors to all vertices. Print 1 if it is possible to colour vertices and 0 otherwise.

Vertex are 1-based (vertext number starts with 1, not 0).
 */

public class Test6solve {

    public static boolean kColorable(List<Integer>[] G , int[] color, int i, int C){
        // Your code here

        int n = G.length;

        if(i==n){
            return true;
        }

        //System.out.println("i "+i);

        //suitable color for i

        for(int j=1;j<=C;j++){

            //System.out.println("j "+j);

            if( checkSuitableColor(G[i],color,j )  ){

                //System.out.println("j "+j);

                color[i] = j;

                if(kColorable(G,color,i+1,C) ){
                    return true;
                }

            }

        }


        return false;

    }

    public static boolean checkSuitableColor( List<Integer> v,int[] color, int assignedColor ){



        for(int t : v){

            if( color[t] == assignedColor){
                return false;
            }
        }
        return true;
    }

}