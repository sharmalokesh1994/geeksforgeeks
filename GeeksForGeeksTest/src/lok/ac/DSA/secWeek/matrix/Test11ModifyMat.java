package lok.ac.DSA.secWeek.matrix;

/**
 * Created by Lokesh Sharma on 13-06-2019.
 */

/*
******************************************************
* Interchanging the rows of a Matrix
* *****************************************************
 */

/*
You are given a matrix A of dimensions n1 x m1. You have to interchange the rows(first row becomes last row and so on).
 */
public class Test11ModifyMat {

    public static void main(String[] args) {

    }

    static void interchangeRows(int n1, int m1, int arr1[][])
    {
        //Your code here

        if(n1==1){
            return;
        }

        int firstRow = 0;
        int lastRow = n1-1;
        for(int i=0;i<m1;i++){
            int temp = arr1[firstRow][i];
            arr1[firstRow][i] = arr1[lastRow][i];
            arr1[lastRow][i] = temp;

        }
    }
}
