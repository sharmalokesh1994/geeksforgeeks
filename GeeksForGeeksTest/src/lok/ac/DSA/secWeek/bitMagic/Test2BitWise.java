package lok.ac.DSA.secWeek.bitMagic;

/**
 * Created by Lokesh Sharma on 11-06-2019.
 */

/*
*****************************************************
Rightmost different bit
*****************************************************
 */

/*
Given two numbers M and N. The task is to find the position of rightmost different bit in binary representation of numbers.
 */
public class Test2BitWise {

    public static void main(String[] args) {

        System.out.println(posOfRightMostDiffBit(52,4));
    }

    public static int posOfRightMostDiffBit(int m, int n) {

        // Your code here
        if(m==n){
            return -1;
        }

        int tXor = m^n;

        int res=0;

        for(int i=0;i<32;i++){
            int temp = tXor & 1;
            if(temp>0){
                res = i+1;
                break;
            }
            tXor=tXor>>1;
        }

        return res;

    }
}
