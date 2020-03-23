package com.company.DSA.week3.sort;


/*
************************************************
Binary Array Sorting
* **********************************************
 */


/*
Given a binary array A[] of size N. The task is to arrange array in increasing order.

Note: The binary array contains only 0  and 1.
 */

public class Test4BinarySort {

    public static void main(String[] args) {

    }

    static void binSort(int arr[], int n)
    {
        // add your code here

        int pivote = 1;

        int i=0;
        int j = 0;
        for(;j<n;j++){
            if(arr[j]<pivote){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j] = temp;

                i++;
            }
        }
    }

}
