package com.company.DSA.week6.Tree;

/*
***********************************************************
Construct Binary Tree from Parent Array
* *********************************************************
 */

/*
Given an array of size N that represents a Tree in such a way that array indexes are values in tree nodes and array values give the parent node of that particular index (or node). The value of the root node index would always be -1 as there is no parent for root. Construct the standard linked representation of Binary Tree from this array representation.
 */

import java.util.ArrayList;
import java.util.TreeMap;

public class Test26GfG {

    public static Node createTree(int arr[], int n)
    {
        //Your code here

        TreeMap<Integer, ArrayList<Integer>> tMap = new TreeMap<>();

        for(int i=0;i<n;i++){

            int t = arr[i];

            if(tMap.containsKey(t) ){
                tMap.get(t).add(i);
            }else{
                ArrayList<Integer> temp = new ArrayList<Integer>();
                temp.add(i);
                tMap.put(t,temp);
            }

        }

        int firstKey = -1;
        int value = tMap.get(-1).get(0);

        Node root = new Node(value);

        makeTree(tMap,value,root);

        return root;
    }

    public static void makeTree(TreeMap<Integer,ArrayList<Integer>> tMap,int value,Node root){

        if(!tMap.containsKey(value) ){
            return;
        }

        ArrayList<Integer> t = tMap.get(value);

        if(t.size()==1){
            int v = t.get(0);
            root.left = new Node(v);
            makeTree(tMap,v,root.left);
        }else{
            int v = t.get(0);
            root.left = new Node(v);
            makeTree(tMap,v,root.left);

            v = t.get(1);
            root.right = new Node(v);
            makeTree(tMap,v,root.right);
        }

    }

}
