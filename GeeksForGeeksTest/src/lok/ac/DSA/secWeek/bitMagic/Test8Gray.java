package lok.ac.DSA.secWeek.bitMagic;

/**
 * Created by Lokesh Sharma on 11-06-2019.
 */

/*
*************************************************************************
Gray Code
*************************************************************************
 */

/*
You are given a decimal number N. You need to find the gray code of the number n and conver it into decimal.
To see how it's done, refer here.
 */
public class Test8Gray {

    public static void main(String[] args) {

        System.out.println(greyConverter(7));

    }

    public static int greyConverter(int n) {

        // Your code here

        int temp = n >> 1;

        return temp ^ n;

    }

}
