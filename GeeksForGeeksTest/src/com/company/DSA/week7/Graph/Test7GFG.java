package com.company.DSA.week7.Graph;

/*
******************************************
Find whether path exist
* ****************************************
 */

/*
Given a N X N matrix (M) filled with 1, 0, 2, 3. The task is to find whether there is a path possible from source to destination, while traversing through blank cells only. You can traverse up, down, right and left.

A value of cell 1 means Source.
A value of cell 2 means Destination.
A value of cell 3 means Blank cell.
A value of cell 0 means Blank Wall.
Note: there is only single source and single destination.
 */

import java.util.*;
import java.lang.*;
import java.io.*;

public class Test7GFG {

    static int row[] = {-1,0,0,1};
    static int col[] = {0,-1,1,0};

    public static void main (String[] args) {
        //code



        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();



        while(t>0){
            t--;

            int N = sc.nextInt();

            ArrayList<ArrayList<Integer> > list = new ArrayList<>(N);

            for(int i=0;i<N;i++){
                ArrayList<Integer> l1 = new ArrayList<>(N);
                list.add(l1);
            }

            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    int a = sc.nextInt();
                    list.get(i).add(j,a);
                }
            }

            if(findPath(list,N) ){
                System.out.println("1");
            }else{
                System.out.println("0");
            }
        }

    }

    public static boolean findPath(ArrayList<ArrayList<Integer> > list, int N){

        int Si = 0;
        int Sj = 0;

        boolean vis[][] = new boolean[N][N];

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(list.get(i).get(j)==1 ){
                    Si = i;
                    Sj = j;
                    break;
                }
            }
        }

        return DFS(list,N,Si,Sj,vis);

    }

    public static boolean DFS(ArrayList<ArrayList<Integer> > list, int N,int i,int j, boolean vis[][] ){

        if(list.get(i).get(j)==2 ){
            return true;
        }

        vis[i][j] = true;
        for(int a=0;a<4;a++){
            if( isSafe(list,N,i+row[a],j+col[a],vis ) ){
                if(DFS(list,N,i+row[a],j+col[a],vis )){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isSafe(ArrayList<ArrayList<Integer> > list, int N,int i,int j, boolean vis[][] ){
        return (i>=0 && i<N) && (j>=0 && j<N ) && ( list.get(i).get(j)>1 && !vis[i][j] );
    }




}