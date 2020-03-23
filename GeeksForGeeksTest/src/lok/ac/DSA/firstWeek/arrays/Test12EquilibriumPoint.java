package lok.ac.DSA.firstWeek.arrays;

/**
 * Created by Lokesh Sharma on 08-06-2019.
 */


/*
Given an array A of N positive numbers. The task is to find the position where equilibrium first occurs in the array. Equilibrium position in an array is a position such that the sum of elements before it is equal to the sum of elements after it.
 */
public class Test12EquilibriumPoint {


    public static void main(String[] args) {

       // long arr[] = {1,3,5,2,2};

        long arr[] = {43,34,2,8,17,5,11,8};

        System.out.println(equilibriumPoint(arr,arr.length));

    }


    public static int equilibriumPoint(long arr[], int n){

        // Your code here

        int low = 0;
        int high = n-1;

        long belowSum=0;
        long afterSum = 0;

        while(low<=high){
            if(belowSum == afterSum && low==high){
                return low+1;
            }
            if(belowSum<=afterSum){
                belowSum=belowSum+arr[low];
                low++;
            }else {
                afterSum = afterSum+arr[high];
                high--;
            }
        }


        return -1;

    }

}
