package com.company.DSA;

import java.util.*;
import java.io.*;
import java.lang.*;

public class test3 {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for(int t=0;t<testCases;t++){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.print("()");
            new solve().printAllSubsets(arr,n);
            System.out.println();
        }
    }
}

/*This is a function problem.You only need to complete the function given below*/

class solve{
    public static void printAllSubsets(int arr[], int n){
        // your code here

        LinkedHashSet<ArrayList<Integer>> hSet = new LinkedHashSet<>();

        ArrayList<Integer> list = new ArrayList<>();

       // hSet.add(list);

        Arrays.sort(arr);

        finalAns(arr,n,hSet,0,list);

        StringBuffer sb = new StringBuffer();

        for(ArrayList<Integer> t : hSet ){

            int p = t.size();

            if(p>0){

                sb.append("(" );

                int i=1;

                for(int a:t){
                    if(i==p){
                        sb.append(a);
                    }else{
                        sb.append(a+" ");
                    }
                    i++;
                }
                sb.append(")" );



            }

        }

        System.out.println(sb.toString());

    }


    public static void finalAns(int arr[], int n, LinkedHashSet<ArrayList<Integer>> hSet, int a, ArrayList<Integer> temp){

        if(hSet.contains(temp) ){
            return;
        }

        hSet.add(temp);

        for(int i=a;i<n;i++ ){

            ArrayList<Integer> temp1 = (ArrayList<Integer>) temp.clone();
            temp1.add(arr[i]);
            finalAns(arr,n,hSet,i+1,temp1 );
        }

    }

}