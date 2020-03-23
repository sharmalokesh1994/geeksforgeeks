package lok.ac.DSA.thirdWeek;

/**
 * Created by Lokesh Sharma on 22-06-2019.
 */


/*
******************************************************************
* Find triplets with zero sum
* ****************************************************************
 */


/*
Given an array A[] of N elements. The task is to complete the function which returns true if triplets exists in array A whose sum is zero else returns false.
 */

public class Test9Triplet {
    public static void main(String[] args) {

        int arr[]={0,-1,2,-3,1};

        System.out.println((new Test9Triplet()).findTriplets(arr,arr.length));
    }

    public boolean findTriplets(int arr[] , int n)
    {
        //add code here.

        quickSort(arr,0,n-1);

        for(int i=n-1;i>0;i--){
            int l=0;
            int r=i-1;

            while(r>l){
                if(arr[i]+arr[l]+arr[r]==0){
                    return true;
                }else if(arr[i]+arr[l]+arr[r]>0){
                    r--;
                }else {
                    l++;
                }
            }
        }

        return false;

    }

    public static void quickSort(int arr[], int left, int right){

        if(left>=right){
            return;
        }

        int pi =  partition(arr,left,right);

        quickSort(arr,left,pi-1);
        quickSort(arr,pi+1,right);
    }


    public static int partition(int arr[],int left,int right){
        int i=left;
        int j=left;
        int pivote = arr[right];

        for(;j<=right;j++){
            if(pivote >= arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }

        return i-1;
    }
}
