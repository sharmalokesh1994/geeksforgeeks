package com.company.DSA.week7.Graph;

/*
**********************************************
X Total Shapes
* ********************************************
 */

/*
Given N * M string array of O's and X's. The task is to find the number of 'X' total shapes. 'X' shape consists of one or more adjacent X's (diagonals not included).
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test11GFG {

    static int row[] = {-1,0,0,1};
    static int col[] = {0,-1,1,0};

    public static void main (String[] args) throws Exception{
        //code

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );

        int t = Integer.parseInt(br.readLine() );

        while(t>0){
            t--;

            String nm[] =  br.readLine().trim().split(" ");

            int n = Integer.parseInt(nm[0] );
            int m = Integer.parseInt(nm[1] );


            char arr[][] = new char[n][m];
            String str[] =  br.readLine().trim().split(" ");

            for(int i=0;i<n;i++){

                for(int j=0;j<m;j++){

                    arr[i][j] = str[i].charAt(j);

                }

            }

            System.out.println(count(arr,n,m) );




        }

    }




    public static int count(char arr[][],int n,int m){

        boolean vis[][] = new boolean[n][m];


        int count = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==false && arr[i][j] =='X' ){
                    count ++;
                    check(arr,n,m,vis,i,j );
                }
            }
        }

        return count;

    }



    public static void check( char arr[][],int n,int m,boolean vis[][],int i,int j ){

        vis[i][j] = true;

        for(int a=0;a<4;a++){
            if(safe(arr,n,m,vis,i+row[a],j+col[a] ) ){
                check(arr,n,m,vis,i+row[a],j+col[a] );
            }
        }

    }

    public static boolean safe(char arr[][],int n,int m,boolean vis[][],int i,int j){

        return (i>=0 && i<n) && (j>=0 && j<m) && ( arr[i][j]=='X' && vis[i][j]==false );

    }


}