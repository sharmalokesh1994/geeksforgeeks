package lok.ac.DSA.secWeek.matrix;

/**
 * Created by Lokesh Sharma on 13-06-2019.
 */

/*
*****************************************************************
Rotate by 90 degree
*****************************************************************
 */

/*
Given a square matrix mat[][] of size N x N. The task is to rotate it by 90 degrees in anti-clockwise direction without using any extra space.
 */
public class Test5Rotation {


    public static void main(String[] args) {

        int a[][]={{1,2,3},{4,5,6},{7,8,9}};

        rotateby90(a,a.length);

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[i][j]+" ");
            }
        }


    }

    static void rotateby90(int a[][], int n)
    {
        // Your code here

        if(n==1){
            return;
        }
        for(int i=0;i<n;i++){
            revrseArray(a[i],n);
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                int temp = a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }

    }

    static void revrseArray(int a[],int n){
        int low=0;
        int high = n-1;

        while (low<high){
            int temp = a[low];
            a[low] = a[high];
            a[high]=temp;

            low++;
            high--;
        }
    }
}
