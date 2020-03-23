package lok.ac.DSA.secWeek.bitMagic;

/**
 * Created by Lokesh Sharma on 11-06-2019.
 */

/*
*********************************************************
Bit Difference
*********************************************************
 */

/*
You are given two numbers A and B. Write a program to count number of bits needed to be flipped to convert A to B.
 */
public class Test5CountBitFlip {

    public static void main(String[] args) {
        System.out.println(countBitsFlip(10,20));
    }

    public static int countBitsFlip(int a, int b){

        // Your code here

        int c = a^b;

        if(c==0){
            return 0;
        }
        int count=0;

        while(c>0){
            int t = c & (c-1);

            c = t;

            count++;
        }

        return count;

    }
}
