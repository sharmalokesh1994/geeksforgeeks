package com.company.DSA.week6.BST;

/*
****************************************************
Insert a node in a BST
* **************************************************
 */

/*
Given a BST and some keys, you need to insert the keys in the given BST. Duplicates are not inserted.
 */


public class Test1BST {

    /* This function should insert a new node with given data and
      return root of the modified tree  */
    Node insert(Node root, int data)
    {
        // Your code here

        if(root == null){
            root = new Node(data);
            return root;
        }

        if(root.data == data){
            return root;
        }else if(root.data>data){
            root.left = insert(root.left,data);
            return root;
        }else{
            root.right = insert(root.right,data);
            return root;
        }

    }
}

class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
