package lok.ac.DSA.secWeek.search;

import java.util.Scanner;

/**
 * Created by Lokesh Sharma on 17-06-2019.
 */


/*
****************************************************************
* Count 1's in binary array
* **************************************************************
 */

/*
Given a binary sorted non-increasing array arr of size N. You need to print the count of 1's in the binary array.
 */

public class Test3Ones {

    static Arrays obj = new Arrays();

    // Function to count number of ones in the binary array
    // n: size of array
    public static int countOnes(int n){

        // Your code here

        return binarySearchArr(obj.arr,0,n);

    }

    static int binarySearchArr(int arr[],int start,int end){
        if(start>end){
            return 0;
        }
        int mid = start+(end-start)/2;
        if(arr[mid]==1 && arr[mid+1]==0){
            return mid+1;
        }
        else if(arr[mid]==0){
            return binarySearchArr(arr,start,mid-1);
        }else {
            return binarySearchArr(arr,mid+1,end);
        }
    }


}


class Arrays {

    static int arr[] = new int[5000001];

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t > 0){

            int n = sc.nextInt();

            for(int i = 0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            Test3Ones obj = new Test3Ones();
            System.out.println(obj.countOnes(n));
            t--;
        }

    }
}
