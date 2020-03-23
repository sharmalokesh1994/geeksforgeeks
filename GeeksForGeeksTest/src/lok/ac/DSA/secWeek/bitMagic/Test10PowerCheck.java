package lok.ac.DSA.secWeek.bitMagic;

import java.math.BigInteger;

/**
 * Created by Lokesh Sharma on 11-06-2019.
 */

/*
************************************************************
Power of 2
************************************************************
 */

/*

Given a positive integer N. The task is to check if N is a power of 2. More formally, check if N can be expressed as 2x for some x.

 */

public class Test10PowerCheck {

    public static void main(String[] args) {

        System.out.println(isPowerofTwo(new BigInteger("0")));
    }


    public static boolean isPowerofTwo(BigInteger n){

        // Your code here

        int a1 = n.compareTo(new BigInteger("0"));
        if(a1==0){
            return false;
        }


        BigInteger b = new BigInteger("-1");

        int a = n.and(n.add(b)).compareTo(new BigInteger("0"));

        if(a>0){
            return false;
        }
        return true;


    }
}
