package com.company.DSA.week5.stack;

import java.util.Stack;

/*
******************************************
Next larger element
* ************************************************
 */

/*
Given an array A[] of size N having distinct elements, the task is to find the next greater element for each element of the array in order of their appearance in the array. If no such element exists, output -1.
 */

public class Test15solve {

    public static void printNGE(long[] arr, int n) {
        // Your code here

        Stack<Long> st = new Stack<>();

        long tempArr[] = new long[n];

        for(int i=n-1;i>=0;i--){
            while(!st.empty() && st.peek()<=arr[i]  ){
                st.pop();
            }

            StringBuffer temp = new StringBuffer();

            if(st.empty()){
                tempArr[i] = -1;
            }else{
                tempArr[i] = st.peek();
            }

            st.push(arr[i]);



        }

        StringBuffer sb = new StringBuffer();

        for(int i=0;i<n;i++){
            sb.append(tempArr[i]+" ");
        }

        System.out.print(sb);
    }

}
