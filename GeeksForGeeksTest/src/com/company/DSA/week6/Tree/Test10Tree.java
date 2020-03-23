package com.company.DSA.week6.Tree;

import java.util.LinkedList;
import java.util.Queue;

/*
***************************************************
Maximum Width of Tree
* *************************************************
 */

/*
Given a Binary Tree, find the maximum width of it. Maximum width is defined as the maximum number of nodes in any level.
For example, maximum width of following tree is 4 as there are 4 nodes at 3rd level.

          1
       /     \
     2        3
   /    \    /    \
  4    5   6    7
    \
      8
 */


public class Test10Tree {

    // /* Function to get the maximum width of a binary tree*/
    int getMaxWidth(Node root)
    {
        // Your code here

        Queue<Node> q = new LinkedList<>();

        q.add(root);
        q.add(null);

        int width = 0;
        int maxWidth = 0;

        while(!q.isEmpty()){
            Node n = q.poll();
            if(n==null){
                if(maxWidth<width){
                    maxWidth=width;
                }
                width=0;

                if(q.isEmpty()){
                    break;
                }

                n = q.poll();
                q.add(null);

            }
            width++;
            if(n.left!=null){
                q.add(n.left);
            }
            if(n.right !=null){
                q.add(n.right);
            }

        }

        return maxWidth;

    }
}
