package lok.ac.DSA.secWeek.search;

/**
 * Created by Lokesh Sharma on 17-06-2019.
 */


/*
*****************************************************************
Searching an element in a sorted array
*****************************************************************
 */
/*
Given a sorted array arr[] of N integers and a number K is given. The task is to check if the element K is present in the array or not.
 */
public class Test2SearchElement {

    public static void main(String[] args) {

        int arr[]={1,2,3,4,6};

        System.out.println(searchInSorted(arr,arr.length,5));

    }

    static int searchInSorted(int arr[], int n, int x)
    {

        // Your code here
        return binarySearchInArray(arr,0,n,x);

    }


    static int binarySearchInArray(int arr[],int start,int end,int x){
        if(start>end){
            return -1;
        }

        int mid = start + (end-start)/2;

        if(arr[mid]==x){
            return 1;
        }else if(arr[mid]<x){
            return binarySearchInArray(arr,mid+1,end,x);
        }else {
            return binarySearchInArray(arr,start,mid-1,x);
        }

    }
}
