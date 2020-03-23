package lok.ac.DSA.firstWeek.arrays;

/**
 * Created by Lokesh Sharma on 07-06-2019.
 */


/*
Given an array arr[] of size N of positive integers which may have duplicates. The task is to find maximum and second maximum from the array, which must be distinct. If no second max exists, then second max will be -1.
 */
public class Test3ArrayMax {

    public static void main(String[] args) {
        int arr[]={2,1,2};
        largestAndSecondLargest(3,arr);
    }

    static void largestAndSecondLargest(int sizeOfArray, int arr[]){

        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int i=0;i<sizeOfArray;i++){
            if(arr[i]>max){
                max2=max;
                max=arr[i];
            }else if(arr[i]>max2 && arr[i]!=max){
                max2=arr[i];
            }
        }

        if(max2==Integer.MIN_VALUE){
            max2=-1;
        }
        System.out.println(max + " " + max2);
    }

}
