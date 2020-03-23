package com.company.DSA.week9.dynamicProblem;


/*
***************************************************
Fibonacci Numbers - Bottom Up DP
* *************************************************
 */

/*
One of the rudimentary problems to understand DP is finding the nth Fibonacci number. Here, we will solve the problem using bottom-up approach.

You are given a number. You need to find Fibonacci(number).
 */

public class Test1Geeks {

    static long dp[] = new long[100];



    //Complete this function
    public long findNthFibonacci(int number)
    {
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;

        if(dp[number]>0)
            return dp[number];

        for(int i=3;i<=number;i++){
            //Complete this function do dp[i] = dp[i-1]+dp[i-2]
            dp[i] = dp[i-1]+dp[i-2];

        }

        return dp[number];
    }
}
