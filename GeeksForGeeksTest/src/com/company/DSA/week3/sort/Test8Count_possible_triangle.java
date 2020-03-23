package com.company.DSA.week3.sort;

public class Test8Count_possible_triangle {

    public static void main(String[] args) {

        int arr[] = {6,4,9,7,8};
        System.out.println(findNumberOfTriangles(arr,arr.length));

    }

    static long findNumberOfTriangles(int arr[], int n)
    {
        // add your code here

        long count=0;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }

        int k =n-1;
        for(int i=n-2;i>=0;i--){
            for(int j=i-1;j>=0;j--){
                if(arr[k]<arr[j]+arr[i]){
                    count++;
                }
            }
            k--;
        }

        return count;
    }

}
