package lok.ac.DSA.secWeek.search;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by Lokesh Sharma on 19-06-2019.
 */

/*
**************************************************************
Median of Two sorted arrays
**************************************************************
 */


/*
Given two sorted arrays arr[] and brr[] of sizes N and M respectively. The task is to find the median of the two arrays when they get merged.
 */

public class Test18GFG {

    public static void main(String[] args) throws Exception{

        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // taking input of number of testcase
        int T = Integer.parseInt(br.readLine());
       // int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
//            int n = sc.nextInt();
//            int m = sc.nextInt();

            String s[] = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);

            String s1[] = br.readLine().split(" ");
            String s2[] = br.readLine().split(" ");
            int arr1[] = new int[n];
            int arr2[] = new int[m];

            for (int i = 0; i < n; i++) {
                arr1[i] = Integer.parseInt(s1[i]);
            }
            for (int i = 0; i < m; i++) {
                arr2[i] = Integer.parseInt(s2[i]);
            }

            System.out.println(finalValue(arr1,arr2,n,m));
        }


    }


    public static int finalValue(int arr1[],int arr2[],int n,int m){

        int arr[] = new int[m+n];

        int mid1 = (m+n)/2;

        int i=0;
        int j=0;
        int k=0;

        while(i<n && j<m && k<=mid1){
            if(arr1[i]<=arr2[j]){
                arr[k]=arr1[i];
                k++;
                i++;
            }else {
                arr[k]=arr2[j];
                k++;
                j++;
            }
        }

        for(;i<n && k<mid1+1;i++){
            arr[k]=arr1[i];
            k++;
        }

        for(;j<m && k< mid1+1;j++){
            arr[k]=arr2[j];
            k++;
        }

        int totalSize = m+n;
        if(totalSize%2==0){
            int index = totalSize/2;
            int mid = (arr[index]+arr[index-1])/2;
            return mid;
        }else {
            int index = totalSize/2;
            int mid = (arr[index]);
            return mid;
        }
    }
}
