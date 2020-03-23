package lok.ac.DSA.secWeek.matrix;

/**
 * Created by Lokesh Sharma on 14-06-2019.
 */


/*
****************************************************************************
* Search in a matrix
* **************************************************************************
 */

/*
Given a matrix mat[] of size n x m, where every row and column is sorted in increasing order, and a number x is given. The task is to find whether element x is present in the matrix or not.
 */
public class Test12SearchinMat {

    public static void main(String[] args) {

        int arr[][] = {{3,30,38},{44,52,57},{54,60,69}};

        System.out.println(search(arr.length,arr[0].length,arr,68));
    }

    static int search(int n1, int m1, int arr1[][], int x)
    {
        //Your code here

        int col=m1-1;
        int row=0;

        while (row<n1 && col>=0){
            if(x==arr1[row][col]){
                return 1;
            }

            if(x>arr1[row][col]){
                row++;
            }else {
                col--;
            }
        }

        return 0;

    }
}
