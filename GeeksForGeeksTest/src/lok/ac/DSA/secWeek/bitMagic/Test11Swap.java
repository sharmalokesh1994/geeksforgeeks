package lok.ac.DSA.secWeek.bitMagic;

/**
 * Created by Lokesh Sharma on 11-06-2019.
 */

/*
*****************************************************************
* Swap all odd and even bits
* ***************************************************************
 */

/*
Given an unsigned integer N. The task is to swap all odd bits with even bits. For example, if the given number is 23 (00010111), it should be converted to 43(00101011). Here, every even position bit is swapped with adjacent bit on right side(even position bits are highlighted in binary representation of 23), and every odd position bit is swapped with adjacent on left side.
 */
public class Test11Swap {
    public static void main(String[] args) {

        System.out.println(swapBits(84));
    }

    public static int swapBits(int n) {

        // Your code

        int evenNo = n & 0xaaaaaaaa;
        evenNo = evenNo>>1;

        int oddNo = n & 0x55555555;

        oddNo = oddNo <<1;

        int ans = evenNo | oddNo;


        return ans;

    }
}
