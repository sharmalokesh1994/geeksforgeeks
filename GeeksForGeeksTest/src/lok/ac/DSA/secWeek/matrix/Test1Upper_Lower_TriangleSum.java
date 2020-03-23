package lok.ac.DSA.secWeek.matrix;

/**
 * Created by Lokesh Sharma on 13-06-2019.
 */


/*
*********************************************************************
Sum of upper and lower triangles
*********************************************************************
 */

/*
Given a square matrix mat[][] of size N*N, print the sum of upper and lower triangular elements. Upper Triangle consists of elements on the diagonal and above it. Lower triangle consists of elements on the diagonal and below it.

 */
public class Test1Upper_Lower_TriangleSum {
    public static void main(String[] args) {

        int arr[][] = {
                {6,5,4},
                { 1,2,5},
                { 7,9,7}
        };

        Summatrix(arr,arr.length);
    }


    static void Summatrix(int mat[][], int n)
    {
        //Your code here

        if(n==1){
            System.out.print(mat[0][0]+" "+mat[0][0]);
            return;
        }

        int sumUpper=0;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                sumUpper = sumUpper+mat[i][j];
            }
        }

        System.out.print(sumUpper+" ");

        int sumLower = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                sumLower = sumLower+mat[i][j];
            }
        }

        System.out.print(sumLower);

    }
}
