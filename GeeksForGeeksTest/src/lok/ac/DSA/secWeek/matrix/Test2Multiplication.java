package lok.ac.DSA.secWeek.matrix;

/**
 * Created by Lokesh Sharma on 13-06-2019.
 */

/*
*******************************************************
* Multiply the matrices
* *****************************************************

 */


/*
When dealing with matrices, you may, sooner or later, run into the elusive task of matrix multiplication. Here, we will try to multiply two matrices and hope to understand the process.

Two matrices A[][] and B[][] can only be multiplied if A's column size is equal to B's row size. The resultant matrix will have dimensions equal to A's row size and B's column size.

You are given two matrices A and B. A is of dimension n1 x m1; and B is of dimension n2 x m2. You have to multiply A with B and print the resultant matrix. If multiplication is not possible then print -1.
 */

public class Test2Multiplication {

    public static void main(String[] args) {

        int arr1[][] = {
                {4,8 },
                {0,2 },
                {1,6}
        };

        int arr2[][]={{5,2,1},{9,4,1}};

        multiplyMatrix(arr1.length,arr1[0].length,arr2.length,arr2[0].length,arr1,arr2);
    }

    static void multiplyMatrix(int n1, int m1, int n2, int m2, int arr1[][], int arr2[][])
    {
        //Your code here

        if(m1!=n2){
            System.out.print("-1");
            return;
        }

        for(int i=0;i<n1;i++){
            for(int j=0;j<m2;j++){
                int sum=0;
                for(int k=0;k<m1;k++){
                    sum = sum+arr1[i][k]*arr2[k][j];
                }
                System.out.print(sum+" ");
            }
        }

    }
}
