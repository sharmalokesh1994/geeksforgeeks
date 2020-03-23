package lok.ac.DSA.firstWeek.arrays;

/**
 * Created by Lokesh Sharma on 09-06-2019.
 */


/*
Given an array arr[] of N non-negative integers representing height of blocks at index i as Ai where the width of each block is 1. Compute how much water can be trapped in between blocks after raining.
Structure is like below:
|  |
|_|
We can trap 2 units of water in the middle gap.
 */


public class Test18Trap {

    public static void main(String[] args) {

        int arr[]={22,2,0,2,0};

        System.out.println(trappingWater(arr,arr.length));
    }

    static int trappingWater(int arr[], int n) {

        // Your code here
        int arrLeft[] = new int[n];
        int arrRight[] = new int[n];

        int sum=0;

        int maxLeft=0;
        int maxRight=0;

        for(int i =0;i<n;i++){
            if(maxLeft<arr[i]){
                maxLeft=arr[i];
            }
            arrLeft[i]=maxLeft;
        }

        for(int i = n-1;i>=0;i--){
            if(maxRight<arr[i]){
                maxRight=arr[i];
            }
            arrRight[i]=maxRight;
        }

        for(int i=0;i<n;i++){
            int temp=Math.min(arrLeft[i],arrRight[i]);
            sum = sum+temp-arr[i];
        }

        return sum;
    }
}
