package com.company.DSA.week6.Tree;

/*
******************************************************
Foldable Binary Tree
* ****************************************************
 */

/*
Given a binary tree, check if the tree can be folded or not. A tree can be folded if left and right subtrees of the tree are structure wise same. An empty tree is considered as foldable.

Consider the below trees:
(a) and (b) can be folded.
(c) and (d) cannot be folded.

(a)
       10
     /    \
    7      15
     \    /
      9  11
(b)
        10
       /  \
      7    15
     /      \
    9       11
(c)
        10
       /  \
      7   15
     /    /
    5   11
(d)
         10
       /   \
      7     15
    /  \    /
   9   10  12
 */

public class Test27GFG {

    public static boolean isFoldable(Node root)
    {
        // add your code here

        return isFoldable2(root.left,root.right );
    }

    public static boolean isFoldable2(Node left,Node right)
    {
        // add your code here

        if(left==null && right == null){
            return true;
        }

        if(left ==null || right ==null){
            return false;
        }

        return ( isFoldable2(left.left,right.right) && isFoldable2(left.right, right.left ) );


    }


}