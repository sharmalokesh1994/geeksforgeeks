package lok.ac.DSA.secWeek.bitMagic;

/**
 * Created by Lokesh Sharma on 11-06-2019.
 */

/*
**************************************************
Find first set bit
***************************************************
 */

/*
Given an integer an N. The task is to print the position of first set bit found from right side in the binary representation of the number.
 */

public class Test1BitWise {

    public static void main(String[] args) {

        int t = 1;
        System.out.println(getFirstSetBitPos(t));
    }

    public static int getFirstSetBitPos(int n){

        // Your code here

        int res=0;

        if(n==0){
            return 0;
        }

        for(int i=0;i<32;i++){

            int temp = n&1;
            if(temp>0){
                res=i+1;
                break;
            }
            n = n>>1;
        }

        return res;

    }

}
