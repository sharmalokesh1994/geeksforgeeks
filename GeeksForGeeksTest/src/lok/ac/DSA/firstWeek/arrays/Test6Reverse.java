package lok.ac.DSA.firstWeek.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Lokesh Sharma on 07-06-2019.
 */

/*
Given an array arr[] of positive integers of size N. Reverse every sub-array of K group elements.
 */
public class Test6Reverse {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            String inputLine1[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine1[0]);
            int k = Integer.parseInt(inputLine1[1]);

            ArrayList<Integer> mv = new ArrayList<>();

            String inputLine2[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                mv.add(Integer.parseInt(inputLine2[i]));
            }

            reverseInGroups(mv, n, k);

            StringBuffer str = new StringBuffer();

            for(int i=0; i<n; i++){
                str.append(mv.get(i) + " ");
            }
            System.out.println(str);
        }
    }

    // Function to reverse array in group of k
    public static ArrayList<Integer> reverseInGroups(ArrayList<Integer> mv, int n, int k) {
        // add your code here



        for(int i=0;i<n;i=i+k){
            int low=i;
            int high=Math.min(i+k-1,n-1);

            while (low<high){
                int temp=mv.get(low);
                mv.set(low,mv.get(high));
                mv.set(high,temp);
                low++;
                high--;
            }
        }

        return mv;
    }
}
