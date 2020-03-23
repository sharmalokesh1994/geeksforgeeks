package com.company.DSA.week6.BST;
/*
*********************************
Check for BST
* *********************************
 */

/*
Given an ArrayList of N lowercase characters. The task is to count frequency of elements in the list.
 */

import java.util.ArrayList;

public class Test12GfG {

    int isBST(Node root)
    {
        // Your code here

        ArrayList<Integer> arr = new ArrayList<>();

        inOrder(root,arr);

        for(int i=1;i<arr.size();i++ ){
            int t1 = arr.get(i-1);
            int t2 = arr.get(i);

            if(t2<=t1){
                return 0;
            }

        }

        return 1;

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
