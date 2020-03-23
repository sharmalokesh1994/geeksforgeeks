package com.company.DSA.week8.backTracking.Test2;


/*
*************************************************
Rat Maze With Multiple Jumps
* ***********************************************
 */

/*
A Maze is given as N*N binary matrix of blocks where source block is the upper left most block i.e., maze[0][0] and destination block is lower rightmost block i.e., maze[N-1][N-1]. A rat starts from source and has to reach the destination. The rat can move in only two directions: first forward if possible or down. If multiple solutions exist, the shortest earliest hop will be accepted. For the same hop distance at any point, forward will be preferred over downward.
In the maze matrix, 0 means the block is the dead end and non-zero number means the block can be used in the path from source to destination. The non-zero value of mat[i][j] indicates number of maximum jumps rat can make from cell mat[i][j].
In this variation, Rat is allowed to jump multiple steps at a time instead of 1.
 */

public class Test2RatInMaze {

    public static void solve(int[][] a, int N)
    {
        // add your code here

        int ans[][] = new int[N][N];

        if(makeAns(a,N,ans,0,0 ) ){
            print(N,ans);
        }else{
            System.out.println(-1);
        }





    }

    public static boolean makeAns(int[][] a, int N,int [][]ans, int i,int j ){

        if(i==N-1 && j==N-1){
            ans[i][j]=1;
            return true;
        }

        if( isValid(a,N,ans,i,j) ){

            ans[i][j] = 1;

            int t = a[i][j];

            for(int p=1;p<=t && p<N;p++ ){


                if( makeAns(a,N,ans,i,j+p) ){
                    return true;
                }

                if( makeAns(a,N,ans,i+p,j) ){
                    return true;
                }

            }
            ans[i][j] = 0;

        }

        return false;

    }

    //isSafe
    public static boolean isValid(int[][] a, int N,int [][]ans, int i,int j){

        if( (i>=0 && i<N) && (j>=0 && j<N ) && a[i][j]!=0  ){
            return true;
        }
        return false;

    }



    public static void print(int N, int[][] arr)
    {
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}
