package lok.ac.DSA.firstWeek.arrays;

/**
 * Created by Lokesh Sharma on 07-06-2019.
 */

/*
Reversing an array is one of the most basic array operation.

You are given an array arr[] whose size is denoted by sizeOfArr. You need to reverse the elements of the array.

 */
public class Test5Reverse {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        arrayReversal(arr,arr.length);

        for(int a: arr){
            System.out.println(a);
        }
    }

    // This function should reverse contents of
    // arr[0..sizeOfArray-1]
    public static void arrayReversal(int arr[],int sizeOfArray)
    {
        //Write your code here

        int low =0;
        int high =sizeOfArray-1;

        while (low<high){
            int temp = arr[low];
            arr[low]=arr[high];
            arr[high] = temp;

            low++;
            high--;
        }

    }
}
