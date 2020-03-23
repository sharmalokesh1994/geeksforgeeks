package com.company.DSA.week7.heap;


/*
******************************************************
Merge k Sorted Arrays
* ****************************************************
 */

/*
Given K sorted arrays arranged in form of a matrix. The task is to merge them. You need to complete mergeKArrays() function which takes 2 arguments, an arr[k][k] 2D Matrix containing k sorted arrays and an integer k denoting the number of sorted arrays. The function should return a pointer to the merged sorted arrays.
 */


import java.util.ArrayList;
import java.util.PriorityQueue;

public class Test10GfG {

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
