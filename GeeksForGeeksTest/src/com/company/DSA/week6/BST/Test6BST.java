package com.company.DSA.week6.BST;

/*
***************************************************************
Lowest Common Ancestor in a BST
* *************************************************************
 */

/*
Given a Binary Search Tree and 2 nodes value n1 and n2, your task is to find the lowest common ancestor(LCA) of the two nodes .
Note: Duplicates are not inserted in the BST.
 */

public class Test6BST {
    Node LCA(Node node, int n1, int n2)
    {
        // Your code here

        if(node.data>=n1 && node.data<=n2 || node.data<=n1 && node.data>=n2){
            return node;
        }else if(node.data>n1 && node.data>n2){
            return LCA(node.left,n1,n2);
        }else{
            return LCA(node.right,n1,n2);
        }

    }

}
