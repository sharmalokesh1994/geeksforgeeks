package lok.ac.DSA.firstWeek.arrays;

import java.util.Scanner;

/**
 * Created by Lokesh Sharma on 08-06-2019.
 */


/*

Very Very Important

 */


/*
You are given an array arr[] of N integers including 0. The task is to find the smallest positive number missing from the array.
Note: Expected solution in O(n) time using constant extra space.
 */

public class Test14Missing {
    public static void main(String[] args) {


       // int arr[]={0,-10,1,3,-20};
        //int arr[]={1,2,3,4,5};

        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        System.out.println(missingNumber(arr,arr.length));

    }


    static int missingNumber(int arr[], int size)
    {

        // Your code here
        // You can add utility functions (if required)

        int n =size;
        int j=n-1;
        for(int i=0;i<size;i++){
            //arr[i]=arr[i]-1;
            if(arr[i]<=0){
                arr[i]=n+10;
            }
        }

        for(int i=0;i<size;i++){
            if(arr[i]<n){
                int temp = arr[i];
                int temp1 = Math.abs(temp);
                if(temp1<n){
                    if(arr[temp1-1]>0){
                        arr[temp1-1]=-arr[temp1-1];
                    }
                }
            }
        }

        for(int i=0;i<n;i++){
            if(arr[i]>=0 || arr[i]>=n){
                return i+1;
            }
        }

        return n+1;
    }
}
