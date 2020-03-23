package com.company.DSA.week7.Graph;

/*
*************************************************
Find the number of islands
* ***********************************************
 */

/*
A group of connected 1's forms an island. The task is to complete the method findIslands() which returns the number of islands present. The function takes three arguments the first is the boolean matrix A and then the next two arguments are N and M denoting the size(N*M) of the matrix A .
 */

import java.util.ArrayList;

public class Test4Islands {

    static int row[] = {-1,-1,-1,0,0,1,1,1};
    static int col[] = {-1,0,1,-1,1,-1,0,1};
    // Function to find the number of island in the given list
    // N, M: size of list row and column respectively
    static int findIslands(ArrayList<ArrayList<Integer>> list, int N, int M)
    {

        // Your code here

        int count =0;
        boolean vis[][] = new boolean[N][M];

        for(int i=0;i<N;i++){

            for(int j=0;j<M;j++){

                if(!vis[i][j] && list.get(i).get(j)==1 ){
                    count++;
                    DFS(list,i,j,N,M,vis );
                }

            }

        }
        return count;
    }



    static void DFS(ArrayList<ArrayList<Integer>> list, int r,int c,int N,int M,boolean vis[][]){

        vis[r][c] = true;

        for(int i=0;i<8;i++){
            if(isSafe(list,r+row[i],c+col[i],N,M,vis )  ){
                DFS(list,r+row[i],c+col[i],N,M,vis );
            }
        }

    }

    static boolean isSafe(ArrayList<ArrayList<Integer>> list, int r,int c,int N,int M,boolean vis[][]){

        return ((r>=0 && r<N) && (c>=0 && c<M) && (list.get(r).get(c)==1 && !vis[r][c] ) );

    }



}
