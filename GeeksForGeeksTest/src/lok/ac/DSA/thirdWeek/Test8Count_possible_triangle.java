package lok.ac.DSA.thirdWeek;

import java.util.Arrays;

/**
 * Created by Lokesh Sharma on 22-06-2019.
 */

/*
************************************************
Count possible triangles
************************************************
 */


/*
Given an unsorted array arr of positive integers. Find the number of triangles that can be formed with three different array elements as lengths of three sides of triangles.
 */

public class Test8Count_possible_triangle {
    public static void main(String[] args) {

        //int arr[] = {10, 21, 22, 100, 101, 200, 300};

        int arr[] = {6,4,9,7,8};
        System.out.println(findNumberOfTriangles(arr,arr.length));

    }

    static long findNumberOfTriangles(int arr[], int n)
    {
        // add your code here

        int count = 0;

        Arrays.sort(arr);

        for(int i=n-1;i>0;i--){
            int l=0;
            int h = i-1;

            while(l<h){
                if(arr[l]+arr[h]>arr[i]){
                    count = count+h-l;
                    h--;
                }
                else {
                    l++;
                }
            }

        }

        return count;
    }
}
