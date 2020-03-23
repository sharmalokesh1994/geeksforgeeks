package lok.ac.DSA.secWeek.matrix;

/**
 * Created by Lokesh Sharma on 13-06-2019.
 */

/*
****************************************************************
*
Exchange matrix columns
****************************************************************
 */

/*
You are given a matrix A of dimensions n1 x m1. You have to exchange A's first column with last column.
 */
public class Test8ModifyMat {
    public static void main(String[] args) {

        int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        exchangeColumns(a.length,a[0].length,a);

    }

    static void exchangeColumns(int n1, int m1, int arr1[][])
    {
        //Your code here

        if(m1==1){
            for(int i=0;i<n1;i++){
                System.out.print(arr1[i][0]+" ");
            }
            return;
        }

        int lastColumnIndex = m1-1;

        for(int i=0;i<n1;i++){
            int temp = arr1[i][0];
            arr1[i][0]=arr1[i][lastColumnIndex];
            arr1[i][lastColumnIndex]=temp;
        }

        for(int i =0; i<n1;i++){
            for(int j=0;j<m1;j++){
                System.out.print(arr1[i][j]+" ");
            }
        }
    }
}
