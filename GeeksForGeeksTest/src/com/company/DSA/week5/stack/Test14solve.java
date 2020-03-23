package com.company.DSA.week5.stack;


/*
*************************************************
Stock span problem
* ***********************************************
 */

/*
The stock span problem is a financial problem where we have a series of n daily price quotes for a stock and we need to calculate the span of stock’s price for all n days.
The span Si of the stock’s price on a given day i is defined as the maximum number of consecutive days just before the given day, for which the price of the stock on the current day is less than or equal to its price on the given day.
For example, if an array of 7 days prices is given as {100, 80, 60, 70, 60, 75, 85}, then the span values for corresponding 7 days are {1, 1, 1, 2, 1, 4, 6}.
 */

import java.util.Stack;

public class Test14solve {

    public static void calculateSpan(int price[], int n, int s[])
    {
        // Your code here


        Stack<Integer> st = new Stack<>();

        st.push(0);

        s[0] = 1;

        for(int i=0;i<n;i++){
            while(!st.empty() && price[st.peek()]<=price[i] ){
                st.pop();
            }

            if(st.empty()){
                s[i] = i+1;
            }
            else{
                s[i] = i-st.peek();
            }
            st.push(i);
        }


    }
}
