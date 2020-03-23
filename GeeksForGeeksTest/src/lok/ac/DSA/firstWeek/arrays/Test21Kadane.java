package lok.ac.DSA.firstWeek.arrays;

/**
 * Created by Lokesh Sharma on 09-06-2019.
 */

/*
Given an array arr of N integers. Find the contiguous sub-array with maximum sum.
 */
public class Test21Kadane {

    public static void main(String[] args) {
        int arr[] = {-1,2,3,-2,5};

        System.out.println(new Test21Kadane().maxSubarraySum(arr,arr.length));
    }


    int maxSubarraySum(int arr[], int n){

        // Your code here

        int sum[]=new int[n];



        sum[0]=arr[0];

        for(int i=1;i<n;i++){
            if(sum[i-1]<0){
                sum[i]=arr[i];
            }else {
                sum[i]=sum[i-1]+arr[i];
            }
        }

        int max=sum[0];

        for(int i=0;i<n;i++){
            if(max<sum[i]){
                max=sum[i];
            }
        }

        return max;
    }
}
