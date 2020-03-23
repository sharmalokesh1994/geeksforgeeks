package lok.ac.HakerEarth;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Lokesh Sharma on 23-06-2019.
 */



/*

You are required to collect  numbers from a bag. Initially, the bag is empty. Whenever you put a number  in the bag, then the owner of the bag asks the question.

The questions are as follows:

What is the greatest integer that is smaller than  and present inside the bag?
What is the smallest number that is greater than  and present inside the bag?
If you answer both the questions correctly, then you can put  inside the bag. Your task is to answers the questions that are asked by the owner of the bag.

Input format

First line:  denoting the number of integers that you want to put inside the bag
Next  lines:  denoting the integer that you want to put inside the bag

 */

public class Test1 {


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i_arr=0; i_arr<N; i_arr++)
        {
            arr[i_arr] = sc.nextInt();
        }
        solve(arr, N);
    }
    static void solve(int[] arr, int N){
        // Please write your code here

        System.out.println("-1"+" -1");


        int n=1;
        int justSmall = -1;
        int justGreat = -1;
        int peakIndex=n;

        while(n<N){

            justSmall = -1;
            justGreat = -1;
            peakIndex=n;

            int i=0;
            for(;i<n;i++){
                if(arr[i]>arr[n]){
                    peakIndex = i;
                    justGreat = arr[i];
                    break;
                }
            }
            if(i>0){
                justSmall = arr[i-1];
            }

            for(int j=peakIndex;j<n;j++){


                int temp = arr[j];
                arr[j] = arr[n];
                arr[n] = temp;

            }
            System.out.println(justSmall+" "+justGreat);
            n++;
        }

    }

    static void putNthValue(int arr[],int n,int N){

        if(N<=n){
            return;
        }

        int justSmall = -1;
        int justGreat = -1;
        int peakIndex=n;

        int i=0;
        for(;i<n;i++){
            if(arr[i]>arr[n]){
                peakIndex = i;
                justGreat = arr[i];
                break;
            }
        }
        if(i>0){
            justSmall = arr[i-1];
        }

        for(int j=peakIndex;j<n;j++){


                int temp = arr[j];
                arr[j] = arr[n];
                arr[n] = temp;

        }


        System.out.println(justSmall+" "+justGreat);
            putNthValue(arr,n+1,N);
    }
}
