package com.company.DSA.week7.Graph.Test12;
/*
*****************************************************
Distance of nearest cell having 1
* ***************************************************
 */

/*
Given a binary matrix of size N x M. The task is to find the distance of nearest 1 in the matrix for each cell. The distance is calculated as |i1 – i2| + |j1 – j2|, where i1, j1 are the row number and column number of the current cell and i2, j2 are the row number and column number of the nearest cell having value 1.
 */

import java.util.*;

public class Test12Distance {

    static int row[] = {-1,0,0,1};
    static int col[] = {0,-1,1,0};
    static void nearest(ArrayList<ArrayList<Integer>> arr, int n, int m)
    {

        int dis[][] = new int[n][m];
        Queue<Pair> q = new LinkedList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++ ){
                if(arr.get(i).get(j)==1 ){
                    dis[i][j] = 0;
                    Pair p = new Pair();
                    p.i = i;
                    p.j = j;
                    q.add(p);
                }else{
                    dis[i][j] = Integer.MAX_VALUE;
                }
            }

        }


        while(!q.isEmpty() ){
            Pair p = q.poll();

            int r = p.i;
            int c= p.j;

            for(int i=0;i<4;i++){
                int next_r = r+row[i];
                int next_c = c +col[i];

                if( (next_r>=0 && next_r<n) && (next_c>=0 && next_c<m ) && dis[next_r][next_c]> dis[r][c]+1 ){
                    Pair p1 = new Pair();
                    p1.i = next_r;
                    p1.j = next_c;

                    dis[next_r][next_c] = dis[r][c]+1;

                    q.add(p1);
                }

            }

        }

        StringBuffer sb = new StringBuffer();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++ ){
                sb.append(dis[i][j]+" ");
            }

        }
        System.out.println(sb.toString());

    }
}

class Pair{
    int i;
    int j;
}
