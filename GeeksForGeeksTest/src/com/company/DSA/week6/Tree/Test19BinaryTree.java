package com.company.DSA.week6.Tree;

/*
**********************************************************
Print a Binary Tree in Vertical Order
* ********************************************************
 */

/*
You are given a binary tree for which you have to print its vertical order traversal. your task is to complete the function verticalOrder which takes one argument the root of the binary tree and prints the node of the binary tree in vertical order as shown below.
If there are multiple nodes passing through a vertical line, then they should printed as they appear in level order traversal.
 */


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;



public class Test19BinaryTree {

    static void verticalOrder(Node root)
    {
        // add your code here

        TreeMap<Integer, ArrayList<Node>> tMap = new TreeMap<>();

        Queue<Test> q = new LinkedList<>();

        Test t = new Test();
        t.n = root;
        t.a = 0;

        q.add(t);

        while(!q.isEmpty() ){
            Test t2 = q.poll();

            Node n = t2.n;

            if(tMap.containsKey(t2.a) ){
                tMap.get(t2.a).add(n);
            }else{
                ArrayList<Node> list = new ArrayList<Node>();
                list.add(n);
                tMap.put(t2.a,list);
            }

            if(n.left!=null){
                Test t3 = new Test();
                t3.n = n.left;
                t3.a = t2.a-1;
                q.add(t3);
            }

            if(n.right!=null){
                Test t3 = new Test();
                t3.n = n.right;
                t3.a = t2.a+1;
                q.add(t3);
            }

        }


        for(int a : tMap.keySet() ){
            for(Node n : tMap.get(a) ){
                System.out.print(n.data+" ");
            }
        }

    }



}

class Test{
    Node n;
    int a;
}
