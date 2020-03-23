package lok.ac.DSA.secWeek.bitMagic;

/**
 * Created by Lokesh Sharma on 11-06-2019.
 */

/*
*****************************************************************
Check whether K-th bit is set or not
*****************************************************************
 */

/*
Given a number N and a bit number K, check if Kth bit of N is set or not. A bit is called set if it is 1. Position of set bit '1' should be indexed starting with 0 from LSB side in binary representation of the number.
Example, Consider N = 4(100):  0th bit = 0, 1st bit = 0, 2nd bit = 1.
 */

public class Test3CheckBit {

    public static void main(String[] args) {
        System.out.println();
    }

    static boolean checkKthBit(int n, int k){

        // Your code here

        int temp = (int)Math.pow(2,k);

        if((temp & n)>0){
            return true;
        }else {
            return false;
        }

    }
}
