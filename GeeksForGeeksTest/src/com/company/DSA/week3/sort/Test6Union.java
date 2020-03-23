package com.company.DSA.week3.sort;

/*
************************************************************
Union of Two Sorted Arrays
* **********************************************************
 */

/*
Given two sorted arrays arr[] and brr[] of size N and M respectively. The task is to find the union of these two arrays.

Union of two arrays can be defined as the common and distinct elements in the two arrays.
 */

public class Test6Union {

    public static void main(String[] args) {



    }

    static void findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here

        int arrU[]= new int[m+n];
        int i=0;
        int j=0;
        int k=0;

        while (i<n && j<m){

            if(arr1[i]==arr2[j] || (k>0 && arr1[i]==arrU[k-1])){
                i++;
            }else if(k>0 && arr2[j]==arrU[k-1]){
                j++;
            }else if(arr1[i]<arr2[j]){
                arrU[k]=arr1[i];
                k++;
                i++;
            }else if(arr1[i]>arr2[j]){
                arrU[k]=arr2[j];
                k++;
                j++;
            }
        }

        for(;i<n;i++){

            if(k>0 && arr1[i]!=arrU[k-1]){
                arrU[k]=arr1[i];
                k++;
            }

        }
        for(;j<m;j++){
            if(k>0 && arr2[j]!=arrU[k-1]) {
                arrU[k] = arr2[j];
                k++;
            }
        }

        StringBuffer sb = new StringBuffer();

        for(int t=0;t<k;t++){
            sb.append(arrU[t]+" ");
        }

        System.out.print(sb);
    }
}
