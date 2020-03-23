package com.company.DSA.week6.BST;

/*
Convert Level Order Traversal to BST
 */

/*
Given an array of size N containing level order traversal of a BST. The task is to complete the function constructBst(), that construct the BST (Binary Search Tree) from its given level order traversal.
 */

public class Test14GFG {

    public Node constructBST(int[] arr){
        //Write your code here and return the root of the constructed BST

        Node root = new Node(arr[0]);


        int i=1;

        int n = arr.length;

        while(i<n){

            root = levelOrder(root,arr[i]);

            i++;

        }

        return root;

    }


    public static Node levelOrder(Node root, int data){
        if(root==null){
            return new Node(data);
        }

        if(root.data>data){
            root.left = levelOrder(root.left,data);
        }else{
            root.right = levelOrder(root.right,data);
        }

        return root;
    }

}
