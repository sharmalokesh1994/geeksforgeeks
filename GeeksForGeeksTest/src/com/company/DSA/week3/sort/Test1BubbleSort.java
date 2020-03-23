package com.company.DSA.week3.sort;


/*
********************************************************
Bubble Sort
* ******************************************************
 */

/*
The task is to complete bubble function which is used to implement Bubble Sort!
 */

public class Test1BubbleSort {
    public static void main(String[] args) {


    }

    static void bubble(int arr[], int i, int n)
    {
        // add your code here

        for(int j=i;j<n;j++){

            if(arr[i]>arr[j]){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }

        }

    }
}
