package com.company.DSA.week8.backTracking.Test3;

/*
**********************************************
Black and White
* ********************************************
 */

/*
How many ways are there to place a black and a white knight on an N * M chessboard such that they do not attack each other? The knights have to be placed on different squares. A knight can move two squares horizontally and one square vertically (L shaped), or two squares vertically and one square horizontally (L shaped). The knights attack each other if one can reach the other in one move.
 */


public class Test3BlackAndWhite {

    static int row[] = {-2,-2,-1,-1,1,1,2,2};
    static int col[] = {-1,1,-2,2,-2,2,-1,1};
    static long solve(int N, int M)
    {
        // add your code here

        long n = N;
        long m = M;

        long nm = n*m;

        nm = nm-1;

        long tempNM = nm;

        long ans = 0;

        for(int  i=0;i<N;i++){
            for(int j=0;j<M;j++){
                tempNM = nm;
                for( int k=0;k<8;k++ ){
                    if(isSafe( N,M,i+row[k],j+col[k] ) ){
                        tempNM--;
                    }
                }

                ans = ans + tempNM;

            }
        }

        return ans;

    }

    public static boolean isSafe(int N, int M,int i,int j){
        return ( (i>=0 && i<N) && (j>=0 && j<M ) );
    }

}
