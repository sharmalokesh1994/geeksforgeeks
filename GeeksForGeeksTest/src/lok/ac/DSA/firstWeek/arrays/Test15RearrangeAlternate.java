package lok.ac.DSA.firstWeek.arrays;

/**
 * Created by Lokesh Sharma on 10-06-2019.
 */


/*
**********************************************************
* *******************************************************
* Rearrange Array Alternately
***********************************************
 */

/*

Given a sorted array of positive integers. Your task is to rearrange  the array elements alternatively i.e first element should be max value, second should be min value, third should be second max, fourth should be second min and so on.

Note: O(1) extra space is allowed. Also, try to modify the input array as required.
 */


public class Test15RearrangeAlternate {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7,8};

        rearrange(arr,arr.length);

        for(int a : arr){
            System.out.println(a);
        }

    }

    public static void rearrange(int arr[], int n){

        // Your code here


        int min_index = 0;
        int max_index = n-1;

        int max_value = arr[n-1]+1;

        for(int i=0;i<n;i++){
            if(i%2==0){
                arr[i] = arr[i]+(arr[max_index]%max_value)*max_value;
                max_index--;
            }else {
                arr[i] = arr[i] + (arr[min_index]%max_value)*max_value;
                min_index++;
            }
        }

        for(int i = 0;i<n;i++){
            arr[i] = arr[i]/max_value;
        }
    }
}
