package com.company.DSA.week8.greedy.Test5;

/*
*******************************************************
Largest number with given sum
* *****************************************************
 */

/*
A boy lost the password of his super locker. He remembers the number of digits N as well as the sum S of all the digits of his password. He know that his password is the largest number of N digits that can be possible with given sum S. As he is busy doing his homework, help him retrieving his password.
 */

public class Test5Solution {
    static String largestNumber(int n, int sum)
    {
        // add your code here

        if(sum > n*9){
            return -1+"";
        }

        StringBuffer sb = new StringBuffer();

        for(int i=0;i<n;i++){
            if(sum>9){
                sb.append(9);
                sum = sum - 9;
            }else{
                sb.append(sum);
                sum=0;
            }
        }

        return sb.toString();

    }
}
