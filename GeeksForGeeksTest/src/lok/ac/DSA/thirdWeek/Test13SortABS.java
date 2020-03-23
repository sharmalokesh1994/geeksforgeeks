package lok.ac.DSA.thirdWeek;

/**
 * Created by Lokesh Sharma on 24-06-2019.
 */


/*
*********************************************************************
Sort by Absolute Difference
*********************************************************************
 */

/*

Given an array of N elements and a number K. The task is to arrange array elements according to the absolute difference with K, i. e., element having minimum difference comes first and so on.
Note : If two or more elements are at equal distance arrange them in same sequence as in the given array.

 */

public class Test13SortABS {

    public static void main(String[] args) {

        int arr[] = {10,5,3,9,2};

        sortABS(arr,arr.length,7);

    }

    static void sortABS(int arr[], int n,int k)
    {
        // add your code here

        mergeSort(arr,0,n-1,k);

        StringBuffer sb = new StringBuffer();
        for(int a: arr){
            sb.append(a);
        }

        System.out.print(sb);

    }


    public static void mergeSort(int arr[],int start,int end,int k){
        if(start<end){
            int mid = start+(end-start)/2;

            mergeSort(arr,start,mid,k);
            mergeSort(arr,mid+1,end,k);

            merge(arr,start,end,k);

        }
    }

    public static void merge(int arr[],int start,int end, int k){

        int mid = start+(end-start)/2;

        int l = mid-start+1;
        int r = end-mid;

        int leftArr[] = new int[l];
        int rightArr[] = new int[r];


        int i =0;
        int j =0;
        int a=start;

        for(;i<l;i++){
            leftArr[i] = arr[a];
            a++;
        }

        for(;j<r;j++){
            rightArr[j] = arr[a];
            a++;
        }

        i =0;
        j=0;
        a=start;

        while(i<l && j<r){
            if(Math.abs(k-leftArr[i])<=Math.abs(k-rightArr[j])){
                arr[a] = leftArr[i];
                a++;
                i++;
            }else {
                arr[a]=rightArr[j];
                a++;
                j++;
            }
        }

        for(;i<l;i++){
            arr[a]=leftArr[i];
            a++;
        }

        for(;j<r;j++){
            arr[a]=rightArr[j];
            a++;
        }
    }
}
