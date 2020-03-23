package com.company.DSA.week6.BST;

/*
*******************************************************
Pair Sum in BST
* *****************************************************
 */

/*
Given an array arr[] of N elements to be inserted into BST and a number X. The task is to check if a pair exists in BST whose sum is equal to X.
 */

import java.util.ArrayList;

public class Test8GFG {

    // This function should return true
    // if there is a pair in given BST with
    // given sum.
    static boolean findPair(Node root, int sum) {
        // Your code

        ArrayList<Integer> arr = new ArrayList<Integer>();

        inOrder(root,arr);

        int i = 0;
        int j = arr.size()-1;



        while(i<j){
            int t1 = arr.get(i);
            int t2 = arr.get(j);

            int t = t1+t2;

            if(t==sum){
                return true;
            }else if(t<sum){
                i++;
            }else{
                j--;
            }
        }
        return false;

    }

    static void inOrder(Node root,ArrayList<Integer> arr){
        if(root==null){
            return;
        }
        inOrder(root.left,arr);
        arr.add(root.data);
        inOrder(root.right,arr);

    }
}
