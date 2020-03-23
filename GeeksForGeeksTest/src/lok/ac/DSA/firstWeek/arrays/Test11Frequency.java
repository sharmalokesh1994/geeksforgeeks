package lok.ac.DSA.firstWeek.arrays;

/**
 * Created by Lokesh Sharma on 08-06-2019.
 */

/*
Given an array A[] of N positive integers which can contain integers from 1 to N where elements can be repeated or can be absent from the array. Your task is to count frequency of all elements from 1 to N.

Note: Expected time complexity is O(n) with O(1) extra space.
 */
public class Test11Frequency {

    public static void main(String[] args) {
        int arr[]= {2,3,2,3,5};
        printFrequency(arr,arr.length);
    }


    public static void  printFrequency(int arr[], int n){

        // Your code here


        for(int i=0;i<n;i++){
            arr[i] = arr[i]-1;
        }

        for(int i=0;i<n;i++){
            int temp = arr[i]%n;
            arr[temp] =  arr[temp]+n;
        }

        StringBuffer sb = new StringBuffer();

        for(int i=0;i<n;i++){
            sb.append((int)arr[i]/n+" ");
        }

        System.out.print(sb);

    }

}
