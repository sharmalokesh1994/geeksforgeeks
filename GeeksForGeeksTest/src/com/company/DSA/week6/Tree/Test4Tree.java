package com.company.DSA.week6.Tree;

/*
**********************************************************
Height of Binary Tree
* ********************************************************
 */

/*
Given a binary tree, find height of it.

        1
     /     \
   10      39
  /
5
The above tree has a height of 3.
Note: Height of empty tree is considered 0.
 */

public class Test4Tree {

    int height(Node node)
    {
        // Your code here

        if(node == null){
            return 0;
        }

        int left = 1 + height(node.left);
        int right = 1 + height(node.right);

        return (int) Math.max(left,right);



    }
}
