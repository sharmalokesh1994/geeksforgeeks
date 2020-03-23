package lok.ac.DSA.secWeek.search;

/**
 * Created by Lokesh Sharma on 17-06-2019.
 */

/*
*****************************************************************
Search an Element in an array
*****************************************************************
 */

/*
Given an integer array Arr[] and an element x. The task is to find if the given element is present in array or not.
 */
public class Test1Searching {

    public static void main(String[] args) {

    }

    static int search(int arr[], int n, int x)
    {

        // Your code here

        for(int i=0;i<n;i++){
            if(arr[i]==x){
                return i;
            }
        }

        return -1;

    }
}
