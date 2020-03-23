package com.company.DSA.week6.Tree;

/*
***********************************************
Vertical Width of a Binary Tree
* *********************************************
 */

/*
Given a Binary Tree of N nodes. The task is to find the vertical width of the tree.

The width of a binary tree is the number of vertical paths in that tree.
 */

public class Test18Tree {

    public static int verticalWidth(Node root)
    {
        //Add your code here.

        NodeIndex n = new NodeIndex();

        int index =0;

        n.min =0;
        n.max =0;
        check(root,n,index);

        return n.max - n.min+1;
    }

    public static void check(Node root, NodeIndex n,int i){

        if(root.left!=null){
            int t1 = i;
            int t2 = n.min;
            if(t1==t2){
                n.min--;
            }


            check(root.left,n,i-1);

        }

        if(root.right!=null){

            int t1 = i;
            int t2 = n.max;
            if(t1==t2){
                n.max++;
            }
            check(root.right,n,i+1);

        }



    }
}


class NodeIndex{

    int min;
    int max;
}