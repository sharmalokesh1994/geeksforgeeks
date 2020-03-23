package lok.ac.DSA.secWeek.contest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by Lokesh Sharma on 29-06-2019.
 */


/*

Without Adjacent
 */

/*

Given an array arr[] of N positive integers. The task is to find a subsequence with maximum sum such that there should be no adjacent elements from the array in the subsequence.
 */

public class Test3 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine().trim());

        for(int t=0;t<T;t++){

            int N = Integer.parseInt(br.readLine().trim());

            String str[] = br.readLine().trim().split(" ");

            int arr[] = new int[N];

            for(int i=0;i<N;i++){
                arr[i] = Integer.parseInt(str[i]);
            }

            int lastSum=0;
            int curr_sum=0;
            int totalSum=0;

            if(N==1){
                System.out.println(arr[0]);
            }else{
                if(arr[0]>arr[1]){
                    curr_sum=arr[0];
                    lastSum=arr[1];
                }else {

                    curr_sum=arr[1];
                    lastSum=arr[0];
                }
                totalSum = curr_sum;

                for(int i=2;i<N;i++){
                    int temp=arr[i]+arr[i-2];
                    if(temp>curr_sum){
                        lastSum=curr_sum;
                        curr_sum=temp;
                        totalSum = totalSum-lastSum+curr_sum;
                    }else if(lastSum<temp){
                        lastSum=temp;
                    }
                }

                System.out.println(totalSum);

            }


        }

    }
}




//Solution

class gfg
{
    static long arr[] = new long[1000001];

    static long FindMaxSum(int n)
    {
        long  incl = arr[0];
        long  excl = 0;
        long  excl_new;
        int i = 0;

        for (i = 1; i < n; i++)
        {
	        /* current max excluding i */
            excl_new = (incl > excl)? incl: excl;

	        /* current max including i */
            incl = excl + arr[i];
            excl = excl_new;
        }

             /* return max of incl and excl */
        return ((incl > excl)? incl : excl);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt();

            for(int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            if(n == 1) System.out.println(arr[0]);
            else
                System.out.println(FindMaxSum(n));
        }
    }
}