package com.company.DSA.week7.Graph;

/*
*************************************************
Unit Area of largest region of 1's
* ***********************************************
 */

/*
Consider a matrix with N rows and M columns, where each cell contains either a ‘0’ or a ‘1’ and any cell containing a 1 is called a filled cell. Two cells are said to be connected if they are adjacent to each other horizontally, vertically, or diagonally. If one or more filled cells are connected, they form a region. The task is to find the unit area of the largest region.
 */

public class Test14Area {

    static int row[] = {-1,-1,-1,0,0,1,1,1};
    static int col[] = {-1,0,1,-1,1,-1,0,1};
    static int findAreaUtil(int n, int m, int g[][], boolean vis[][])
    {
        int ans = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++ ){

                if(vis[i][j]==false && g[i][j]==1 ){
                    ans = (int) Math.max(ans,  BFS(n,m,g,vis,i,j ) );
                }

            }
        }

        return ans;

    }

    public static int BFS(int n, int m, int g[][], boolean vis[][],int r,int c){
        if(vis[r][c]){
            return 0;
        }

        vis[r][c]=true;

        int count =1;

        for(int i=0;i<8;i++){
            if(isSafe(n,m,g,vis,r+row[i],c+col[i] ) ){
                count = count + BFS(n,m,g,vis,r+row[i],c+col[i] );
            }

        }
        return count;

    }

    public static boolean isSafe(int n, int m, int g[][], boolean vis[][],int r,int c ){
        return (r>=0 && r<n ) && (c>=0 && c<m ) && (g[r][c]==1 && vis[r][c]==false );
    }
}