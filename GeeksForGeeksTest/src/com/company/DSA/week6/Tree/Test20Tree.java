package com.company.DSA.week6.Tree;

/*
***********************************************
Mirror Tree
* *********************************************
 */

/*
Given a Binary Tree, convert it into its mirror.
 */

public class Test20Tree {

    void mirror(Node node)
    {
        // Your code here

        if(node == null ){
            return;
        }

        if(node.left==null && node.right==null ){
            return;
        }


        Node n = node.left;
        node.left = node.right;
        node.right = n;

        mirror(node.left);
        mirror(node.right);

    }
}