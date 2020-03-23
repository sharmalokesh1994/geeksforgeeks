package lok.ac.DSA.firstWeek.arrays;

/**
 * Created by Lokesh Sharma on 09-06-2019.
 */

/*

Given an array arr[] of N distinct integers, check if this array is Sorted (non-increasing or non-decreasing) and Rotated counter-clockwise. Note that input array may be sorted in either increasing or decreasing order, then rotated.
A sorted array is not considered as sorted and rotated, i.e., there should be at least one rotation.

 */

public class Test20SortedRotated {

    public static void main(String[] args) {

        int arr[] = {3,4,1,2};

        System.out.println(checkRotatedAndSorted(arr,arr.length));
    }

    public static boolean checkRotatedAndSorted(int arr[], int num){

        // Your code here

        int n =num;
        boolean ass=true;

        for(int i=0;i<n-1;i++){
            if(arr[i]!=arr[i+1]){
                if(arr[i]>arr[i+1]){
                    ass = false;
                }
                break;
            }
        }


        int peak=n;


        if(ass){
            for(int i=0;i<n-1;i++){
                if(arr[i]>arr[i+1]){
                    peak = i;
                    break;
                }
            }

            if(peak==n){
                return false;
            }

            reverse(arr,0,peak);
            reverse(arr,peak+1,n-1);

            for(int i=0;i<n-1;i++){
                if(arr[i]<arr[i+1]){
                    return false;

                }


            }
            return true;

        } else {

            for(int i=0;i<n-1;i++){
                if(arr[i]<arr[i+1]){
                    peak = i;
                    break;
                }
            }

            if(peak==n){
                return false;
            }

            reverse(arr,0,peak);
            reverse(arr,peak+1,n-1);

            for(int i=0;i<n-1;i++){
                if(arr[i]>arr[i+1]){
                    return false;

                }


            }
            return true;

        }


    }

    public static void reverse(int arr[],int i,int j){

        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

    }
}
