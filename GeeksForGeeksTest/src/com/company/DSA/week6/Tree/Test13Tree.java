package com.company.DSA.week6.Tree;

import java.util.LinkedList;
import java.util.Queue;

/*
********************************************************
Left View of Binary Tree
* ******************************************************
 */

/*

Given a Binary Tree, print Left view of it. Left view of a Binary Tree is set of nodes visible when tree is visited from Left side. The task is to complete the function leftView(), which accepts root of the tree as argument.

Left view of following tree is 1 2 4 8.

          1
       /     \
     2        3
   /     \    /    \
  4     5   6    7
   \
     8
 */

public class Test13Tree {

    void leftView(Node root)
    {
        // Your code here

        Queue<Node> q = new LinkedList<>();

        q.add(root);
        q.add(null);
        System.out.print(root.data+" ");

        while(!q.isEmpty() ){
            Node n = q.poll();
            if(n==null){
                if(q.isEmpty()){
                    return;
                }
                n = q.poll();
                System.out.print(n.data+" ");
                q.add(null);
            }

            if(n.left!=null){
                q.add(n.left);
            }
            if(n.right!=null){
                q.add(n.right);
            }


        }

    }
}
