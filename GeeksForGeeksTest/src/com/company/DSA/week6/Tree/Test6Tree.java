package com.company.DSA.week6.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Test6Tree {
    public static int isSumProperty(Node node)
    {
        // add your code here

        Queue<Node> q = new LinkedList<>();

        q.add(node);


        while(!q.isEmpty()){

            Node n = q.poll();

            if(n.left==null && n.right ==null){
                continue;
            }else if(n.left==null){
                if(n.data==n.right.data){
                    q.add(n.right);
                }else{
                    return 0;
                }
            }else if(n.right==null){
                if(n.data==n.left.data){
                    q.add(n.left);
                }else{
                    return 0;
                }
            }else{
                if(n.data==n.left.data+n.right.data){
                    q.add(n.left);
                    q.add(n.right);
                }else{
                    return 0;
                }
            }

        }

        return 1;
    }
}
