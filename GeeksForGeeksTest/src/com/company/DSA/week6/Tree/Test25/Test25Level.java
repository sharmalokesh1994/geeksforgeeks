package com.company.DSA.week6.Tree.Test25;

/*
********************************************************************
Connect Nodes at Same Level
* ******************************************************************
 */

/*
Given a binary tree, connect the nodes that are at same level.
Structure of the given Binary Tree node is like following.

struct Node
{
      int data;
      Node* left;
      Node* right;
      Node* nextRight;
}
Initially, all the nextRight pointers point to garbage values. Your function should set these pointers to point next right for each node.
       10                       10 ------> NULL
      / \                       /      \
     3   5       =>     3 ------> 5 --------> NULL
    / \     \               /  \           \
   4   1   2          4 --> 1 -----> 2 -------> NULL
 */

import java.util.LinkedList;
import java.util.Queue;

public class Test25Level {
    static void connect(Node root)
    {
        // add your code here

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty() ){

            Node n = q.poll();

            if(n==null){

                if(q.isEmpty()){
                    return;
                }

                n = q.poll();
                q.add(null);

            }

            n.nextRight = q.peek();

            if(n.left!=null){
                q.add(n.left);
            }
            if(n.right!=null ){
                q.add(n.right);
            }

        }


    }


}




class Node
{
    int data;
    Node left, right, nextRight;
    Node(int x)
    {
        this.data = x;
        left = right = nextRight = null;
    }


}
