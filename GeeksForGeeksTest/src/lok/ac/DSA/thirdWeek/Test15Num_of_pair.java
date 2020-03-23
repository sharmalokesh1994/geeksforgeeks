package lok.ac.DSA.thirdWeek;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by Lokesh Sharma on 24-06-2019.
 */


/*
**********************************************************
Number of pairs
**********************************************************
 */

/*
Given two arrays X and Y of positive integers, find number of pairs such that xy > yx (raised to power of) where x is an element from X and y is an element from Y.
 */

public class Test15Num_of_pair {


    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int g = 0;g < t;g++)
        {
            String[] str = (br.readLine()).trim().split(" ");
            int n = Integer.parseInt(str[0]);
            int m = Integer.parseInt(str[1]);

            int[] x = new int[n];
            str = (br.readLine()).trim().split(" ");
            for(int i = 0;i< n;i++)
                x[i] = Integer.parseInt(str[i]);

            str = (br.readLine()).trim().split(" ");
            int[] y = new int[m];
            for(int i = 0;i< m;i++)
            {
                y[i] = Integer.parseInt(str[i]);

            }
            System.out.println(countPairs(x, y, n, m));

        }

    }

    static long countPairs(int x[], int y[], int n, int m)
    {
        // your code here

        Arrays.sort(y);
        long count =0;

        for(int i=0;i<n;i++){
            if(x[i]!=0 && x[i]!=1){
                if(x[i]==2){

                    count = count + valueOfElement(y,0,y.length-1,4);
                }
                else if(x[i]==3){

                    for(int j=0;j<y.length;j++){
                        if(y[j]==2){
                            count++;
                        }

                        if(y[j]>2){
                            break;
                        }
                    }

                    count = count+valueOfElement(y,0,y.length-1,3);

                }
                else {
                    count = count+valueOfElement(y,0,y.length-1,x[i]);
                }
            }
        }

        int count1inX = 0;
        for(int i=0;i<x.length;i++){
            if(x[i]==1){
                count1inX++;
            }
        }

        for(int i=0;i<y.length;i++){
            if(y[i]==1){
                count = count+x.length-count1inX;
            }else if(y[i]>1){
                break;
            }
        }

        return count;

    }

    static int valueOfElement(int arr[],int l, int r,int k){
        if(l>r || arr[arr.length-1]<=k){
            return 0;
        }
        if(arr[0]>k){
            return r+1;
        }
        int mid = l+(r-l)/2;

        if(arr[mid]>k){
            if(k==0 || arr[mid-1]<=k){
                return arr.length-mid;
            }
            return valueOfElement(arr,l,mid-1,k);
        }

        return valueOfElement(arr,mid+1,r,k);
    }


}
