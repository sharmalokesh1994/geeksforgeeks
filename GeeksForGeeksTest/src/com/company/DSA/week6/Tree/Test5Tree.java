package com.company.DSA.week6.Tree;

/*
*******************************************************************************************************
Determine if Two Trees are Identical
* *****************************************************************************************************
 */

/*
Given two binary trees, the task is to find if both of them are identical or not.
 */

public class Test5Tree {

    /* Should return true if trees with roots as root1 and
   root2 are identical else false */
    boolean isIdentical(Node root1, Node root2)
    {
        //Your code here

        if(root1==null && root2 ==null){
            return true;
        }
        if(root1==null && root2 !=null){
            return false;
        }
        if(root1!=null && root2 ==null){
            return false;
        }

        if(root1.data!=root2.data){
            return false;
        }

        return (isIdentical(root1.left,root2.left)&isIdentical(root1.right,root2.right));
    }
}
