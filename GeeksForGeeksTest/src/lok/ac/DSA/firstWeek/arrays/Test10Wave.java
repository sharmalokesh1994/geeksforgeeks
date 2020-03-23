package lok.ac.DSA.firstWeek.arrays;

/**
 * Created by Lokesh Sharma on 08-06-2019.
 */
/*
Given a sorted array arr[] of non-repeating integers without duplicates.
Sort the array into a wave-like array and return it. In other words, arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5..... (considering the increasing lexicographical order).
 */


public class Test10Wave {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};
        convertToWave(arr,arr.length);

        for(int a: arr){
            System.out.println(a);
        }

    }

    public static void convertToWave(int arr[], int n){

        // Your code here

        for(int i=0;i<n-1;i++){
            if(i%2==0){
                if(arr[i]<arr[i+1]){
                    swap(arr,i);
                }
            }else {
                if(arr[i]>arr[i+1]){
                    swap(arr,i);
                }
            }
        }

    }

    public static void swap(int arr[], int i){
        int temp = arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=temp;
    }
}
