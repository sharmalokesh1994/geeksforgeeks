package com.company.DSA.week5.stack;


import java.util.Stack;

public class Test13solve {

    public static void main(String[] args) {

        int arr[] = {};

        System.out.println();
    }


    public static long getMaxArea(long hist[], long n)  {
        // your code here

        long prevSmall[] = new long[(int)n];
        long nextSmall[] = new long[(int)n];

        prevSmallMethod(hist,prevSmall,n);

        nextSmallMethod(hist,nextSmall,n);

        long max=0;

        for(int i=0;i<(int)n;i++){
            long temp = hist[i]*(nextSmall[i]-prevSmall[i]);

            if(temp>max){
                max = temp;
            }

        }

        return max;
    }

    public static void prevSmallMethod(long hist[],long arr[], long n){

        Stack<Integer> st = new Stack<>();


        for(int i=1;i<(int)n;i++){

            while(!st.isEmpty() && hist[st.peek()]>hist[i]){
                st.pop();
            }

            if(st.isEmpty()){
                arr[i] = 0;
            }else{
                arr[i] = st.peek();
            }
            st.push(i);

        }
    }


    public static void nextSmallMethod(long hist[],long arr[], long n){

        Stack<Integer> st = new Stack<>();


        for(int i=(int)n-1;i>=0;i--){

            while(!st.isEmpty() && hist[st.peek()]>hist[i]){
                st.pop();
            }

            if(st.isEmpty()){
                arr[i] = (int)n-1;
            }else{
                arr[i] = st.peek();
            }
            st.push(i);

        }
    }
}
