package com.company.DSA.week6.Tree.Test22;


/*
************************************************************
Make Binary Tree From Linked List
* **********************************************************
 */

/*
Given a Linked List Representation of Complete Binary Tree. The task is to construct the Binary tree.

Note : The complete binary tree is represented as a linked list in a way where if root node is stored at position i, its left, and right children are stored at position 2*i+1, 2*i+2 respectively.
 */


import java.util.LinkedList;
import java.util.Queue;

public class Test22GFG {

    public static Tree convert(Node head, Tree node) {
        // add code here.}

        node = new Tree(head.data);

        Queue<Tree> q = new LinkedList<>();

        q.add(node);

        while(head!=null ){
            Tree n = q.poll();

            head = head.next;
            if(head==null){
                break;
            }

            n.left =new Tree(head.data);

            head = head.next;

            if(head==null){
                break;
            }

            n.right = new Tree(head.data);

            q.add(n.left);
            q.add(n.right);

        }
        return node;
    }
}

class Tree{
    int data;
    Tree left;
    Tree right;
    Tree(int d){
        data=d;
        left=null;
        right=null;
    }
}
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}