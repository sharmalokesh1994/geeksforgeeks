package lok.ac.DSA.secWeek.matrix;

/**
 * Created by Lokesh Sharma on 13-06-2019.
 */

/*
**********************************************************
* Print Matrix in snake Pattern
* ********************************************************
 */


/*
Given a matrix mat[][] of size N x N. The task is to print the elements of the matrix in the snake pattern.

 */
public class Test3Snake_Pattern {

    public static void main(String[] args) {

        int a[][]={
                {45,48,54 },
                {21,89,87 },
                {70,78,15}
        };

        print(a,a.length);
    }


    static void print(int a[][], int n)
    {
        //Your code here

        for(int i=0;i<n;i++){
            if(i%2==0){
                for(int j=0;j<n;j++){
                    System.out.print(a[i][j]+" ");
                }
            }else {
                for(int j=n-1;j>=0;j--){
                    System.out.print(a[i][j]+ " ");
                }
            }
        }
    }
}
