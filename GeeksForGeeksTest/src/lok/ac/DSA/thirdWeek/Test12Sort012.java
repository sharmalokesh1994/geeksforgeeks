package lok.ac.DSA.thirdWeek;

/**
 * Created by Lokesh Sharma on 24-06-2019.
 */


/*
********************************************
Closet 0s 1s and 2s
********************************************
 */


/*
Given an array A of size N containing 0s, 1s, and 2s. The task is to segregate the 0s , 1s and 2s in the array as all the 0s should appear in the first part of the array, 1s should appear in middle part of the array and finally all the 2s in the remaining part of the array.
 */

public class Test12Sort012 {

    public static void main(String[] args) {

    }



    public static void segragate012(int A[], int n){
        // your code here

        int i = 0;
        int j = 0;

        for(;j<n;j++){
            if(A[j]<1){
                int temp = A[i];
                A[i]=A[j];
                A[j]=temp;
                i++;
            }
        }

        i=i;
        j=i;

        for(;j<n;j++){
            if(A[j]<=1){
                int temp = A[i];
                A[i]=A[j];
                A[j]=temp;
                i++;
            }
        }


    }

















/*
    public static void segragate012(int A[], int n){
        // your code here

        int i = 0;
        int j = 0;

        for(;j<n;j++){
            if(A[j]<=1){
                int temp = A[i];
                A[i]=A[j];
                A[j]=temp;
                i++;
            }
        }

        i=0;
        j=0;

        for(;j<n;j++){
            if(A[j]<1){
                int temp = A[i];
                A[i]=A[j];
                A[j]=temp;
                i++;
            }
        }


    }

  */

}
