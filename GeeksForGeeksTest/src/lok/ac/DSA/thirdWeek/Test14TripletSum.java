package lok.ac.DSA.thirdWeek;

import java.util.Arrays;

/**
 * Created by Lokesh Sharma on 24-06-2019.
 */


/*
****************************************************
Triplet Sum in Array
****************************************************
 */

/*
Given an array A[] of N numbers and another number x. The task is to determine whether or not there exist three elements in A[] whose sum is exactly x.
 */

public class Test14TripletSum {

    public static void main(String[] args) {

    }

    public static int find3Numbers(int A[], int n, int x) {

        //add your code here

        Arrays.sort(A);

        int i=0;
        int j = n-1;

        for(int k = n-1;k>0;k--){
            i = 0;
            j = k-1;

            if(A[k]<x){
                while (i<j){
                    if(A[i]+A[j]+A[k]==x){
                        return 1;
                    }else if(A[i]+A[j]+A[k]<x){
                        i++;
                    }else {
                        j--;
                    }
                }
            }
        }

        return 0;

    }
}
