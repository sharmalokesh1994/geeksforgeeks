package com.company.DSA;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class test2{


    public static void main(String args[]){
        int arr[][] = {{1,2,15},{4,5,6},{7,8,9}};
        ArrayList<Integer> ans = mergeKArrays(arr,3);

        for(int a: ans){
            System.out.println(a);
        }

    }

    public static ArrayList<Integer> mergeKArrays(int[][] arrays,int k){

        ArrayList<Integer> ans = new ArrayList<>();

        PriorityQueue<MinHeapNode> p = new PriorityQueue<>();
        for(int i=0;i<k;i++ ){
            MinHeapNode t = new MinHeapNode(arrays[i][0],0,i);
            p.add(t);
        }

        int t = Integer.MAX_VALUE;
        int i=0;
        int arr[] = new int[k];
        while(i<k*k){
            i++;

            MinHeapNode temp = p.poll();

            ans.add(temp.element);

            int ind = temp.i;
            int arrInd = temp.j;

            int nextInd = ind+1;

            if(ind>=k-1){
                temp = new MinHeapNode(t,nextInd,arrInd);
            }else{
                temp = new MinHeapNode(arrays[arrInd][nextInd],nextInd,arrInd);
            }

            p.add(temp);

        }

       // System.out.println(String.format("%.2f", new solve().fractionalKnapsack(w, arr, n)));

        return ans;

    }

}




class MinHeapNode implements Comparable<MinHeapNode> {
    int element;

    // index of element
    int i;
// j = arrIndex
    int j;

    public MinHeapNode(int element, int i, int j) {
        this.element = element;
        this.i = i;
        this.j = j;
    }


    @Override
    public int compareTo(MinHeapNode o) {
        return this.element - o.element;
    }



}
