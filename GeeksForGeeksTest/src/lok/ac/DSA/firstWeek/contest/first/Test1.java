package lok.ac.DSA.firstWeek.contest.first;

import java.util.Scanner;

/**
 * Created by Lokesh Sharma on 16-06-2019.
 */


/*
*************************************************************
* Get the Shadow
* ***********************************************************
 */


/*
Given an unsorted array A[] of size N of positive integers. One number 'a' from set {1, 2, …N} is missing and one number 'b' occurs twice in array. The task is to find the repeating and the missing.
 */

public class Test1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int t=0;t<T;t++){


            int N = sc.nextInt();

            int arr[] = new int[N];

            for(int i=0;i<N;i++){
                arr[i] = sc.nextInt();
            }

            requiredNo(arr,N);


        }
    }

    static void requiredNo(int arr[],int n){


        int temp = n+1;

        int repeatedNo = 0;
        int missedNo = 0;

        for(int i=0;i<n;i++){
            int t = (arr[i])%temp;

            arr[t-1] = arr[t-1]+temp;
        }

        for(int i=0;i<n;i++){
            if(arr[i]<temp){
                missedNo = i+1;
            }

            if(arr[i]>2*temp){
                repeatedNo = i+1;
            }
        }

        System.out.println(repeatedNo +" "+missedNo);

    }
}
