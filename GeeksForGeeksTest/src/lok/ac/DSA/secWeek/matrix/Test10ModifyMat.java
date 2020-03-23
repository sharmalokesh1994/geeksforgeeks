package lok.ac.DSA.secWeek.matrix;

/**
 * Created by Lokesh Sharma on 13-06-2019.
 */

/*
***************************************************************************
Reversing the columns of a Matrix
***************************************************************************
 */


/*
You are given a matrix A of dimensions n1 x m1. The task is to reverse the columns(first column exchanged with last column and so on).
 */

public class Test10ModifyMat {

    public static void main(String[] args) {

    }

    static void reverseCol(int n1, int m1, int arr1[][])
    {
        //Your code here
        if(m1==1){
            return;
        }

        for(int i=0;i<n1;i++){
            revrseArray(arr1[i],m1);
        }

    }


    static void revrseArray(int a[],int n){
        int low=0;
        int high = n-1;

        while (low<high){
            int temp = a[low];
            a[low] = a[high];
            a[high]=temp;

            low++;
            high--;
        }
    }
}
