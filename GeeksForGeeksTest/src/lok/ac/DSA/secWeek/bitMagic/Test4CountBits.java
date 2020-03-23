package lok.ac.DSA.secWeek.bitMagic;

/**
 * Created by Lokesh Sharma on 11-06-2019.
 */

/*
*********************************************************
Count total set bits
*********************************************************
 */

/*
You are given a number N. Find the total count of set bits for all numbers from 1 to N(both inclusive).
 */

public class Test4CountBits {

    public static void main(String[] args) {

        System.out.println(countSetBits(4));

    }

    public static int countSetBits(int n){

        // Your code here

        if(n==0){
            return 0;
        }

        int count=0;


        int temp = n;

        while (n>0){
            int t=0;

            t = n & (n-1);

            n = t;

            count++;

        }
        return count+countSetBits(temp-1);

    }
}
