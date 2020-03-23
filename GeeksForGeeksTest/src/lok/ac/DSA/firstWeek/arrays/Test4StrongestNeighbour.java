package lok.ac.DSA.firstWeek.arrays;

/**
 * Created by Lokesh Sharma on 07-06-2019.
 */

/*
Given an array arr[] of N positive integers. The task is to find the maximum for every adjacent pairs in the array.
 */
public class Test4StrongestNeighbour {

    public static void main(String[] args) {

        int arr[] = {1,2,2,3,4,5};
        maximumAdjacent(arr.length,arr);
    }

    static void maximumAdjacent(int sizeOfArray, int arr[]){

        /*********************************
         * Your code here
         * Function should print max adjacents for all pairs
         * Use string buffer for fast output
         * ***********************************/

        StringBuffer s = new StringBuffer();

        for(int i=1;i<sizeOfArray;i++){
            s.append(Math.max(arr[i-1],arr[i])+" ");
        }

        System.out.println(s);

    }
}
