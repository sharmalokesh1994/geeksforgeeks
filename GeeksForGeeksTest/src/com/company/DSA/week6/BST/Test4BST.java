package com.company.DSA.week6.BST;

/*
**************************************************
Print Common Nodes in BST
* ************************************************
 */

/*
Given two Binary Search Trees(without duplicates), you need to print the common nodes in them. In other words, find intersection of two BSTs.
 */

import java.util.ArrayList;

public class Test4BST {
    public void printCommon(Node root1,Node root2)
    {
        //add code here.

        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> sec = new ArrayList<>();

        inOrder(root1,first);
        inOrder(root2,sec);

        int i =0;
        int j =0;

        while(i<first.size() && j<sec.size() ){
            int t1 = first.get(i);
            int t2 = sec.get(j);

            if(t1==t2){
                System.out.print(t1+" ");
                i++;
                j++;
            }else if(t1<t2){
                i++;
            }else{
                j++;
            }
        }

    }


    static void inOrder(Node root,ArrayList<Integer> arr){
        if(root==null){
            return;
        }
        inOrder(root.left,arr);
        arr.add(root.data);
        inOrder(root.right,arr);

    }
}
