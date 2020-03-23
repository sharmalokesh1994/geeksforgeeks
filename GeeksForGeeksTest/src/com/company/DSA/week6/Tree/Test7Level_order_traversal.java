package com.company.DSA.week6.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Test7Level_order_traversal {


    //You are required to complete this method
    static void levelOrder(Node node)
    {
        // Your code here

        Queue<Node> q = new LinkedList<>();

        q.add(node);

        while(!q.isEmpty()){

            Node n = q.poll();

            System.out.print(n.data+" ");

            if(n.left!=null){
                q.add(n.left);
            }
            if(n.right!=null){
                q.add(n.right);
            }

        }
    }

}
