package lok.ac.DSA.secWeek.matrix;

/**
 * Created by Lokesh Sharma on 13-06-2019.
 */

/*
**************************************************
Transpose of Matrix
**************************************************
 */

/*
Write a program to find transpose of a square matrix mat[][] of size N*N. Transpose of a matrix is obtained by changing rows to columns and columns to rows.
 */
public class Test4TransposeMatrix {

    public static void main(String[] args) {

        int a[][]={
                {1,1,1,1},
                {2,2,2,2},
                {3,3,3,3},
                {4,4,4,4}
        };

        transpose(a,a.length);

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[i][j]+" ");
            }
        }

    }

    static void transpose(int a[][], int n)
    {
        // Your code here

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                int temp = a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
    }
}
