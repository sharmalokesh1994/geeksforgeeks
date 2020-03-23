package com.company.DSA.week3.sort;

public class Test2InsertionSort {

    public static void main(String[] args) {

        int arr[] = {119,160,390,947,604,251 };

        insert(arr,arr.length);

        printArray(arr,arr.length);


    }

    static void printArray(int arr[],int size)
    {
        int i;
        for(i=0;i<size;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    static void insert(int arr[],int n)
    {
        // Your code here

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++) {

                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }


    }

}
