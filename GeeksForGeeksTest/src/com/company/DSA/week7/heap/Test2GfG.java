package com.company.DSA.week7.heap;

/*
***************************************
Heap Sort
* *************************************
 */

/*
Given an array of size N. The task is to sort the array elements by completing functions heapify() and buildHeap() which are used to implement Heap Sort.
 */

public class Test2GfG {

    void buildHeap(int arr[], int n)
    {
        // Your code here

        int i = (n-2)/2;

        for(;i>=0;i--){
            heapify(arr,n,i);
        }

    }

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    void heapify(int arr[], int n, int i)
    {
        // Your code here

        int l = 2*i+1;
        int r = 2*i+2;

        int smallest = i;

        if(l<n && arr[l] > arr[smallest]){
            smallest = l;
        }
        if(r<n && arr[r]> arr[smallest]){
            smallest = r;
        }

        if(smallest!=i){

            int temp = arr[smallest];

            arr[smallest] = arr[i];
            arr[i] =temp;

            heapify(arr,n,smallest);
        }


    }
}

