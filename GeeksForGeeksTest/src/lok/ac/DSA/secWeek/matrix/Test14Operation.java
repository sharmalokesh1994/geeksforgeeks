package lok.ac.DSA.secWeek.matrix;

/**
 * Created by Lokesh Sharma on 14-06-2019.
 */

/*
*********************************************************************
Make Matrix Beautiful
*********************************************************************
 */


/*
Given a Square matrix mat[] of size NxN. Your task is to find minimum number of operation(s) that are required to make the matrix Beautiful.
A Beautiful matrix is a matrix in which sum of elements in each row and column is equal. In one operation you can only increment any value of cell of matrix by 1.
 */
public class Test14Operation {

    public static void main(String[] args) {

        int arr[][] = {{1,2,3},{4,2,3},{3,2,1}};

        System.out.println(findMinOperation(arr.length,arr));

    }


//    static int findMinOperation(int n, int mat[][])
//    {
//        //Your code here
//
//        int sum =0;
//
//        int sumRow[] = new int[n];
//
//        int max=0;
//
//        for(int i=0;i<n;i++){
//            for(int j=0;j<i;j++){
//                sum = sum + Math.abs(mat[i][j]-mat[j][i]);
//                int temp = Math.max(mat[i][j],mat[j][i]);
//                mat[i][j] = temp;
//                mat[j][i] = temp;
//            }
//        }
//
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                sumRow[i] = sumRow[i] + mat[i][j];
//            }
//        }
//        max = sumRow[0];
//        for(int i=0;i<n;i++){
//            if(max<sumRow[i]){
//                max = sumRow[i];
//            }
//        }
//
//        for(int i=0;i<n;i++){
//            sum = sum+max-sumRow[i];
//        }
//
//        return sum;
//    }


    static int findMinOperation(int n, int mat[][])
    {
        //Your code here

        int sum = 0;

        int sumRow[] = new int[n];
        int sumCol[] = new int[n];

        int max = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sumRow[i] = sumRow[i]+mat[i][j];
            }

            if(sumRow[i]>max){
                max = sumRow[i];
            }
        }

        //col
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sumCol[i] = sumCol[i]+mat[j][i];
            }

            if(sumCol[i]>max){
                max = sumCol[i];
            }
        }

        for(int i =0;i<n;i++){
            sum = sum + max - sumRow[i];
        }

        return sum;
    }
}
