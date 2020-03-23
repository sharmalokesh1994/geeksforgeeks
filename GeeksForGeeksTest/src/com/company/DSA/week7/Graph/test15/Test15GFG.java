package com.company.DSA.week7.Graph.test15;

/*
*******************************************************
Rotten Oranges
* *****************************************************
 */

/*
Given a matrix of dimension r*c where each cell in the matrix can have values 0, 1 or 2 which has the following meaning:
0 : Empty cell
1 : Cells have fresh oranges
2 : Cells have rotten oranges

So, we have to determine what is the minimum time required to rot all oranges. A rotten orange at index [i,j] can rot other fresh orange at indexes [i-1,j], [i+1,j], [i,j-1], [i,j+1] (up, down, left and right) in unit time. If it is impossible to rot every orange then simply return -1.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Test15GFG {
    static int row[] = {-1,0,0,1};
    static int col[] = {0,-1,1,0};

    public static void main (String[] args) throws Exception{
        //code

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in ) );

        int t = Integer.parseInt(br.readLine().trim() );

        while(t>0){
            t--;

            String nm[] = br.readLine().trim().split(" ");

            int n = Integer.parseInt(nm[0].trim() );
            int m = Integer.parseInt(nm[1].trim() );

            String str[] = br.readLine().trim().split(" ");

            int arr[][] = new int[n][m];

            for(int i=0;i<n;i++ ){
                for(int j=0;j<m;j++ ){
                    arr[i][j] = Integer.parseInt(str[i*m+j]);
                }
            }

            System.out.println(BFS(arr,n,m) );

        }

    }

    public static int BFS(int arr[][],int n, int m ){

        int ans=-1;

        Queue<Pair> q = new LinkedList<>();

        for(int i=0;i<n;i++ ){

            for(int j=0;j<m;j++ ){
                if(arr[i][j] == 2 ){

                    Pair p = new Pair();
                    p.i = i;
                    p.j = j;

                    q.add(p);

                }
            }

        }

        q.add(null);

        while( !q.isEmpty() ){

            Pair p = q.poll();

            if(p==null){
                ans++;
                if(q.isEmpty() ){
                    break;
                }

                p = q.poll();
                q.add(null);
            }

            int r = p.i;
            int c = p.j;

            for(int i=0;i<4;i++ ){
                int next_r = r+row[i];
                int next_c = c+col[i];

                if( (next_r>=0 && next_r<n)&& (next_c>=0 && next_c<m )&& (arr[next_r][next_c]==1 )  ){
                    arr[next_r][next_c]=2;

                    Pair p1 = new Pair();
                    p1.i = next_r;
                    p1.j = next_c;

                    q.add(p1);
                }

            }


        }

        for(int i=0;i<n;i++ ){

            for(int j=0;j<m;j++ ){
                if(arr[i][j] == 1 ){
                    return -1;
                }
            }

        }

        return ans;
    }


}


class Pair{
    int i;
    int j;
}