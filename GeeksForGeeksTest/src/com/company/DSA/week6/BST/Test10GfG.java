package com.company.DSA.week6.BST;

/*
******************************************************
Implementing Floor in BST
* ****************************************************
 */

/*
Given an array arr[] of N positive integers to be inserted into BST and a positive integer X. The task is to find floor of X in the BST.
Floor(X) is an element that is either equal to X or immediately smaller to X.
 */


public class Test10GfG {

    int floor(Node root, int key) {
        if(root == null){
            return Integer.MAX_VALUE;
        }

        if(root.data == key){
            return root.data;
        }if(root.data>key ){
            return floor(root.left,key);
        }else{

            int t = floor(root.right,key);

            if(t == Integer.MAX_VALUE){
                return root.data;
            }

            return (int)Math.max(root.data,floor(root.right,key)  );
        }

    }
}