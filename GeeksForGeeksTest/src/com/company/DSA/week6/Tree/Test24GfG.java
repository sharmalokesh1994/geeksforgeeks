package com.company.DSA.week6.Tree;

/*
***********************************************
Binary Tree to CDLL
* *********************************************
 */

/*
Given a Binary Tree of N edges. The task is to convert this to a Circular Doubly Linked List(CDLL) in-place. The left and right pointers in nodes are to be used as previous and next pointers respectively in converted CDLL. The order of nodes in CDLL must be same as Inorder of the given Binary Tree. The first node of Inorder traversal (left most node in BT) must be head node of the CDLL.
 */

public class Test24GfG {

    Node head;
    Node temp;

    Node bTreeToClist(Node root)
    {
        //  Your code here
        if(root==null){
            return null;
        }

        Node left = bTreeToClist(root.left);
        if(left==null){
            if(head==null){
                head = new Node(root.data);
                temp = head;
                temp.right = head;
                head.left = temp;
            }else{
                temp.right = new Node(root.data);
                temp.right.left = temp;
                temp = temp.right;

                temp.right = head;
                head.left = temp;
            }
        }else{
            temp.right = new Node(root.data);
            temp.right.left = temp;
            temp = temp.right;

            temp.right = head;
            head.left = temp;
        }

        bTreeToClist(root.right);

        return head;
    }

}

