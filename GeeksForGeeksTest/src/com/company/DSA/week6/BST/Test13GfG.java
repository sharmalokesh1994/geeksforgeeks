package com.company.DSA.week6.BST;

/*
*************************************************************
Find the Closest Element in BST
* ***********************************************************
 */

/*
Given a BST with N nodes and a target node K. The task is to find an integer having minimum absolute difference with given target value K and return this difference.
 */

public class Test13GfG {

    public static int maxDiff(Node root, int k)
    {
        //add code here.

        if(root==null){
            return Integer.MAX_VALUE;
        }

        int t = (int) Math.abs(root.data -k);

        int t1 = maxDiff(root.left,k);
        int t2 = maxDiff(root.right,k);

        return (int) Math.min( (int) Math.min(t,t1),t2 );

    }
}