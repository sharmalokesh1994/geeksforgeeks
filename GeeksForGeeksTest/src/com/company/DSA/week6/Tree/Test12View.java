package com.company.DSA.week6.Tree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

/*
*****************************************************
Top View of Binary Tree
* ***************************************************
 */

/*
Given below is a binary tree. The task is to print the top view of binary tree. Top view of a binary tree is the set of nodes visible when the tree is viewed from the top. For the given below tree

       1
    /     \
   2       3
  /  \    /   \
4    5  6   7

Top view will be: 4 2 1 3 7
Note: Print from leftmost node to rightmost node.
 */

public class Test12View {

    // function should print the topView of the binary tree
    static void topView(Node root)
    {
        // add your code

        Map<Integer,objNode> qMap = new TreeMap<>();

        Queue<objNode> q = new LinkedList<>();

        objNode obj_ = new objNode(root,0);

        q.add(obj_);

        while(!q.isEmpty() ){
            objNode obj = q.poll();

            if(!qMap.containsKey(obj.order)){
                qMap.put(obj.order,obj);
            }

            if(obj.node.left!=null){
                objNode obj1 = new objNode(obj.node.left,obj.order-1);
                q.add(obj1);
            }
            if(obj.node.right!=null){
                objNode obj1 = new objNode(obj.node.right,obj.order+1);
                q.add(obj1);
            }

        }


        for(int a : qMap.keySet()){
            System.out.print(qMap.get(a).node.data+" ");
        }


    }

}

class objNode{
    Node node;
    int order;

    objNode(Node node,int order){
        this.node = node;
        this.order = order;
    }
}
