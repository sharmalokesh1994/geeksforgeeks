package com.company.DSA.week6.BST.Test7GfG;

/*
*********************************************************************
Print BST elements in given range
* *******************************************************************
 */

/*
Given a Binary Search Tree (BST) and a range, print all the numbers in the BST that lie in the given range l-h(inclusive) in non-decreasing order. If no such element exists, an empty line will be printed.
Note: Element greater than or equal to root go to the right side.
 */

public class Test7GfG {
    void printNearNodes(Node node, int k1, int k2)
    {
        // Your code here
        if(node == null){
            return;
        }


        printNearNodes(node.left,k1,k2);


        if(node.key<=k2 && node.key>=k1){
            System.out.print(node.key+" ");
        }
        printNearNodes(node.right,k1,k2);


    }
}


class Node
{
    int key;
    Node left, right;
    Node(int item)
    {
        key = item;
        left = right = null;
    }
}