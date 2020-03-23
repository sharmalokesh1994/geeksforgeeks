package com.company.DSA.week6.BST;

/*
*********************************************
Implementing Ceil in BST
* *******************************************
 */

/*
Given an array arr[] of N positive integers to be inserted into BST and a number X. The task it to find Ceil of X.
Ceil(X) is a number that is either equal to X or is immediately greater than X.
 */

public class Test11GfG {

    int findCeil(Node root, int key) {
        if (root == null)
            return -1;
        // Code here

        if(root.data == key){
            return root.data;
        }if(root.data<key ){
            return findCeil(root.right,key);
        }else{

            int t = findCeil(root.left,key);

            if(t == -1){
                return root.data;
            }

            return (int)Math.min(root.data,findCeil(root.left,key)  );
        }

    }
}
