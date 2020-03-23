package com.company.DSA.week6.Tree;

import java.util.LinkedList;
import java.util.Queue;

/*
*****************************************************************************
Level order traversal Line by Line
* ***************************************************************************
 */

/*
Given a Binary Tree, your task is to print its level order traversal such that each level is separated by $.
For the below tree the output will be 1 $ 2 3 $ 4 5 6 7 $ 8 $.

          1
       /     \
     2        3
   /    \     /   \
  4     5   6    7
    \
     8
 */

public class Test8Level_Order_Traverse {

    static void levelOrder(Node node)
    {
        // Your code here


        Queue<Node> q = new LinkedList<>();

        q.add(node);
        q.add(null);

        StringBuffer sb = new StringBuffer();

        while(!q.isEmpty()){

            Node n = q.poll();

            if(n==null){
                sb.append("$ ");

                if(q.isEmpty()){
                    break;
                }

                n = q.poll();
                q.add(null);
            }

            sb.append(n.data+" ");

            if(n.left!=null){
                q.add(n.left);
            }
            if(n.right!=null){
                q.add(n.right);
            }

        }
        System.out.print(sb);

    }
}
