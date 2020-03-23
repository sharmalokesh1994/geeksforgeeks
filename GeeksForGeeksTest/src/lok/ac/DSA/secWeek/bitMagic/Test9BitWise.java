package lok.ac.DSA.secWeek.bitMagic;

/**
 * Created by Lokesh Sharma on 11-06-2019.
 */

/*
************************************************************************
Gray to Binary equivalent
************************************************************************
 */

/*

Given N in Gray code equivalent. Find its binary equivalent.

 */
public class Test9BitWise {

    public static void main(String[] args) {
        System.out.println(grayToBinary(4));
    }

    public static int grayToBinary(int n) {

        // Your code here

        int temp =(int) (Math.log10(n)/Math.log10(2));

        int temp1=(int)Math.pow(2,temp) & n;

        int res = 0;

        int tempRes = 0;

        while(temp1>0){
            int first = n & temp1;

            tempRes = (res>>1) & temp1;

            res = res + first ^ tempRes;

            temp1 = temp1 >>1;

        }

        return res;

    }

}
