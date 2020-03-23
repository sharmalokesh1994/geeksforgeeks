package com.company.DSA.week5.stack;

import java.util.Stack;

public class Test16Celebrity {


    // The task is to complete this function
    int getId(int M[][], int n)
    {
        // Your code here

        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++){

            boolean t = true;

            for(int j=0;j<n;j++){

                if(M[i][j]==1 && i!=j){
                    t = false;
                    break;
                }

            }

            if(t){
                st.push(i);
            }
        }



        for(int j : st){
            boolean t = true;
            for(int i=0;i<n;i++){
                if(M[i][j]==0 && i!=j){
                    t=false;
                    break;
                }
            }
            if(t){
                return j;
            }
        }

        return -1;
    }

}
