package lok.ac.DSA.firstWeek.arrays;

/**
 * Created by Lokesh Sharma on 07-06-2019.
 */

/*
Given an unsorted array arr[] of size N, rotate it by D elements (counter-clockwise).
 */
public class Test7RotateArray {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};

        rotateArr(arr,2,5);

        for(int a: arr){
            System.out.println(a);
        }
    }

    static void rotateArr(int arr[], int d, int n)
    {
        // add your code here

        int dArr[] = new int[d];

        for(int i=0;i<d;i++){
            dArr[i]=arr[i];
        }

        for(int i=d;i<n;i++){
            arr[i-d]=arr[i];
        }

        for(int i=n-d;i<n;i++){
            arr[i]=dArr[i-(n-d)];
        }

    }
}
