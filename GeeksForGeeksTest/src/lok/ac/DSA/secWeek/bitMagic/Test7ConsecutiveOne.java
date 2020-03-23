package lok.ac.DSA.secWeek.bitMagic;

/**
 * Created by Lokesh Sharma on 11-06-2019.
 */


/*
**********************************************************************
Longest Consecutive 1's
**********************************************************************
 */

/*
Given a number N. The task is to find the length of the longest consecutive 1s in its binary representation.
 */

public class Test7ConsecutiveOne {

    public static void main(String[] args) {

        System.out.println(maxConsecutiveOnes(8));
    }

    public static int maxConsecutiveOnes(int x) {

        // Your code here

        int count = 0;

        while(x>0){

            count++;

            x = x & (x>>1);

        }

        return count;


    }
}
