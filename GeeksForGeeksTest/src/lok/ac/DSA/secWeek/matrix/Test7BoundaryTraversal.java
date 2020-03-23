package lok.ac.DSA.secWeek.matrix;

/**
 * Created by Lokesh Sharma on 13-06-2019.
 */

/*
**************************************************************
Boundary traversal of matrix
**************************************************************
 */


/*
You are given a matrix A of dimensions n1 x m1. The task is to perform boundary traversal on the matrix.
 */

public class Test7BoundaryTraversal {
    public static void main(String[] args) {

        int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        boundaryTraversal(a.length,a[0].length,a);
    }

    static void boundaryTraversal(int n1, int m1, int a[][])
    {
        //Your code here

        if(n1==1){
            for(int i=0;i<m1;i++){
                System.out.print(a[0][i]+" ");
            }
            return;
        }
        if(m1==1){
            for(int i=0;i<m1;i++){
                System.out.print(a[i][0]+" ");
            }
            return;
        }

        int i=0;
        int j=0;

        for(;j<m1;j++){
            System.out.print(a[i][j]+" ");
        }
        j--;
        i=1;
        for(;i<n1;i++){
            System.out.print(a[i][j]+" ");
        }


        i--;
        j--;
        for(;j>=0;j--){
            System.out.print(a[i][j]+" ");
        }
        j=0;
        i--;
        for(;i>0;i--){
            System.out.print(a[i][j]+" ");
        }


    }
}
