package com.company.DSA.week3.sort;

public class MergeSort {

    public static void main(String[] args) {

        int arr[] = {3,5,2,4,1};
        mergeSort(arr,0,arr.length-1);

        for(int a: arr){
            System.out.println(a);
        }

    }

    public static void mergeSort(int arr[], int left,int right ){

        if( left>=right ){
            return;
        }

        int mid = left + ( right - left )/2;

        mergeSort(arr,left,mid);

        mergeSort(arr,mid+1,right);

        merge(arr,left,right,mid);
    }

    public static void merge( int arr[],int left, int right,int mid ){

        int leftSize = mid-left+1;
        int rightSize = right-mid;

        int leftArr[] = new int[leftSize];
        int rightArr[] = new int[rightSize];


        int k = left;
        int i=0;
        for( ;k<=mid;k++ ){
            leftArr[i] = arr[k];
            i++;
        }

        int j = 0;
        for( ;k<=right;k++ ){
            rightArr[j] = arr[k];
            j++;
        }

        k = left;
        i=0;
        j=0;

        while (i<leftSize && j<rightSize){

            if( leftArr[i]<rightArr[j] ){
                arr[k] = leftArr[i];
                i++;
                k++;
            }else{
                arr[k] = rightArr[j];
                j++;
                k++;
            }

        }

        while( i<leftSize ){
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while( j<rightSize ){
            arr[k] = rightArr[j];
            j++;
            k++;
        }


    }

}
