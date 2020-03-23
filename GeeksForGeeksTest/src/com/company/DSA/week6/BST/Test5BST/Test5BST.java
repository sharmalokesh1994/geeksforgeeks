package com.company.DSA.week6.BST.Test5BST;
/*
***********************************************
Delete a node from BST
* **********************************************
 */

/*
Given a Binary Search Tree (BST) and a node no 'x', your task is to delete the node 'x' from the BST.
Note: The duplicates are not inserted in the BST.
 */


public class Test5BST {
    Node deleteNode(Node root, int key)
    {
        // Your code here

        Node parent = null;

        Node t = root;

        while(t!=null && t.key !=key ){
            parent = t;
            if(t.key>key){
                t = t.left;
            }else{
                t = t.right;
            }
        }
        if(t==null){
            return root;
        }


        if(t.left==null && t.right == null){

            if(parent == null){
                return null;
            }
            if(parent.left == t){
                parent.left = null;
            }else{
                parent.right = null;
            }
        }else if(t.left==null){

            if(parent == null){
                return t.right;
            }

            if(parent.left == t){
                parent.left = t.right;
            }else{
                parent.right = t.right;
            }
        }else if(t.right == null){

            if(parent == null){
                return t.left;
            }

            if(parent.left == t){
                parent.left = t.left;
            }else{
                parent.right = t.left;
            }
        }else{
            Node rep = t.left;
            Node repPar = t;

            while(rep.right!=null){
                repPar = rep;
                rep = rep.right;
            }
            if(repPar!=t){
                repPar.right = rep.left;
            }else{
                repPar.left = rep.left;
            }

            rep.left = t.left;
            rep.right = t.right;

            if(parent == null){
                return rep;
            }

            if(parent.left == t){

                parent.left = rep;
            }else{
                parent.right = rep;
            }

        }

        return root;
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
