package com.company.DSA.week9.dynamicProblem;

/*
*************************************************************
Fibonacci Numbers - Top Down DP
* ***********************************************************
 */

/*
One of the rudimentary problems to understand DP is finding the nth Fibonacci number. Here, we will solve the problem using top-down approach.

You are given a number. You need to find Fibonacci(number).
 */

public class Test2Geeks {

    static long dp[] = new long[100];

    //Complete this function
    public long findNthFibonacci(int number)
    {
        if(dp[number]>0)
            return dp[number];

        if(number<=0){
            dp[0] = 0;
            return 0;
        }

        if(number==1 || number == 2){
            dp[number]=1;
            return 1;
        }

        dp[number] = findNthFibonacci(number-1)+ findNthFibonacci(number-2) ;

        //Complete this line. dp[number] is equal to function(n-1)+function(n-2)
        return dp[number];
    }
}
