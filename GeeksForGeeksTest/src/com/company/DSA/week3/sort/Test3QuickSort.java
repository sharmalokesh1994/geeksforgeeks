package com.company.DSA.week3.sort;
/*
*************************************************
* Quick Sort
* ***********************************************
 */

/*
Given an array arr[] of size N. The task is to complete partition() function which is used to implement Quick Sort.
 */


public class Test3QuickSort {

    public static void main(String[] args) {

    }

    static int partition(int arr[], int low, int high)
    {
        // add your code here

        int pivotePoint = arr[high];



        int i= low-1;
        int j = low;

        for(;j<=high;j++){
            if(arr[j]<=pivotePoint){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }



        return i;
    }
}
