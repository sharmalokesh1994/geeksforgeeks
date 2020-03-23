package com.company.DSA.week3.sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
*****************************************************
* Intersection of two sorted arrays
* ***************************************************
 */

/*
Given two sorted arrays arr1[] and arr2[] of sizes N and M respectively. The task is to find intersection of the two arrays.

Intersection of two arrays contains the elements common to both the arrays. The intersection should not count duplicate elements.
 */

public class Test7Intersection {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String st[] = br.readLine().trim().split(" ");
        int N = Integer.parseInt(st[0]);
        int M = Integer.parseInt(st[1]);

        int arr1[] = new int[N];
        int arr2[] = new int[M];

        st = br.readLine().trim().split(" ");
        for(int i = 0; i < N; i++)
            arr1[i] = Integer.parseInt(st[i]);
        st = br.readLine().trim().split(" ");
        for(int i = 0; i < M; i++)
            arr2[i] = Integer.parseInt(st[i]);

    }

    static void printIntersection(int arr1[], int arr2[], int n, int m)
    {
        // add your code here

        int arrI[] = new int[m+n];

        int i=0;
        int j=0;
        int k=0;

        while (i<n && j<m){

            if((arr1[i]==arr2[j] && k==0 )|| ( arr1[i]==arr2[j] && (k>0 && arr1[i]!=arrI[k-1]))){
                arrI[k]=arr2[j];
                k++;
                j++;
                i++;
            }else if(arr1[i]<arr2[j]){
                i++;
            }else {
                j++;
            }
        }


        StringBuffer sb = new StringBuffer();

        for(int t=0;t<k;t++){
            sb.append(arrI[t]+" ");
        }

        if(k!=0){
            System.out.print(sb);
            return;
        }

        System.out.print("-1");



    }

}
