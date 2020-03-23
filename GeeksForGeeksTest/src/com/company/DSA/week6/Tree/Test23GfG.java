package com.company.DSA.week6.Tree;

/*
*******************************************
Binary Tree to DLL
* *****************************************
 */

/*
Given a Binary Tree (BT), convert it to a Doubly Linked List(DLL) In-Place. The left and right pointers in nodes are to be used as previous and next pointers respectively in converted DLL. The order of nodes in DLL must be same as Inorder of the given Binary Tree. The first node of Inorder traversal (left most node in BT) must be head node of the DLL.
 */


public class Test23GfG {

    Node head;
    Node temp;
    Node bToDLL(Node root)
    {
        //  Your code here
        if(root==null){
            return null;
        }

        Node left = bToDLL(root.left);
        if(left==null){
            if(head==null){
                head = new Node(root.data);
                temp = head;
            }else{
                temp.right = new Node(root.data);
                temp.right.left = temp;
                temp = temp.right;
            }
        }else{
            temp.right = new Node(root.data);
            temp.right.left = temp;
            temp = temp.right;
        }

        bToDLL(root.right);

        return head;


    }
}
