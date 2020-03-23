package lok.ac.DSA.secWeek.matrix;

import java.util.Set;

/**
 * Created by Lokesh Sharma on 14-06-2019.
 */


/*
**************************************************************************
* Boolean Matrix Problem
* ************************************************************************
 */

/*

Given a boolean matrix mat[r][c] of size r X c, modify it such that if a matrix cell mat[i][j] is 1 (or true) then make all the cells of ith row and jth column as 1.
 */

public class Test13ModifyMat {

    public static void main(String[] args) {

        int arr[][] ={{0,0,0},{0,0,1}};
        booleanMatrix(arr.length,arr[0].length,arr);

    }

    static void booleanMatrix(int r, int c, int mat[][])
    {
        //Your code here

        int row[] = new int[r];
        int col[] = new int[c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(mat[i][j]==1){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }

        StringBuffer sb = new StringBuffer();

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(row[i]==1 || col[j]==1){
                    sb.append(1+" ");
                }else {
                    sb.append(0+" ");
                }
            }
            System.out.println(sb);
            sb = new StringBuffer();
        }


    }
}
