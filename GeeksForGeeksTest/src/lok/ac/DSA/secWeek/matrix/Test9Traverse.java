package lok.ac.DSA.secWeek.matrix;

/**
 * Created by Lokesh Sharma on 13-06-2019.
 */


/*
**************************************************************************************
* Spirally traversing a matrix
* ************************************************************************************

 */


/*
Given a matrix mat[][] of size M*N. Traverse and print the matrix in spiral form.
 */

public class Test9Traverse {
    public static void main(String[] args) {

        //int a[][]={{1,2,3,4,21},{5,6,7,8,31},{9,10,11,12,32},{13,14,15,16,34}};

       // int a[][] = {{1,2,3},{4,5,6}};

        //int a[][] = {{1,3},{6,7},{8,9},{10,11}};

        int a[][] = {{9,54},{33,58},{88,45},{57,9},{95,98},{14,53},{46,65},{71,54},{52,2},{ 77,67}};

        spirallyTraverse(a.length,a[0].length,a);
    }

    static void spirallyTraverse(int m, int n, int arr1[][])
    {
        //Your code here

        try{
            spirallyTraverse(0,0,m,n,arr1);
        }catch (Exception e){

        }


    }

    static void spirallyTraverse(int r1, int c1, int n1, int m1, int a[][])
    {
        //Your code here

        if(r1>=n1 || c1>=m1){
            return;
        }

        if(n1==r1+1){
            for(int i=c1;i<m1;i++){
                System.out.print(a[r1][i]+" ");
            }
            return;
        }
        if(m1==c1+1){
            for(int i=c1;i<n1;i++){
                System.out.print(a[i][c1]+" ");
            }
            return;
        }

        int i=r1;
        int j=c1;

        for(;j<m1;j++){
            System.out.print(a[i][j]+" ");
        }
        j--;
        i=r1+1;
        for(;i<n1;i++){
            System.out.print(a[i][j]+" ");
        }


        i--;
        j--;
        for(;j>=c1;j--){
            System.out.print(a[i][j]+" ");
        }
        j=c1;
        i--;
        for(;i>r1;i--){
            System.out.print(a[i][j]+" ");
        }

        spirallyTraverse(r1+1,c1+1,n1-1,m1-1,a);
    }
}
