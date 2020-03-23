package lok.ac.DSA.firstWeek.arrays;

/**
 * Created by Lokesh Sharma on 07-06-2019.
 */

/*
Given an array Arr of N integers arranged in a circular fashion. Your task is to find the minimum absolute difference between adjacent elements.
 */
public class Test8Difference {

    public static void main(String[] args) {
        int arr[] = {8,-8,9,-9,10,-11,12};
        System.out.println(minAdjDiff(arr,arr.length));
    }

    public static int minAdjDiff(int arr[], int n) {

        // Your code here

        int min = Math.abs(arr[n-1]-arr[0]);

        for(int i=0;i<n-1;i++){
            int temp = Math.abs(arr[i]-arr[i+1]);
            if(min>temp){
                min=temp;
            }
        }

        return min;
    }
}
