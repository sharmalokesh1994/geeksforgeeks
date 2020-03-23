package lok.ac.DSA.sixthWeek;

import java.util.ArrayList;

/**
 * Created by Lokesh Sharma on 27-07-2019.
 */


/*
***************************************************************
Lowest Common Ancestor in a Binary Tree
***************************************************************
 */

/*

Given a Binary Tree and two nodes value n1 and n2. The task is to find the lowest common ancestor of the given two nodes.
 */

public class Test16Tree {

    Node lca(Node root, int n1,int n2)
    {
        // Your code here

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        findElement(root,n1,list1);
        findElement(root,n2,list2);

        int i=0;
        for(;i<list1.size() && i<list2.size();i++ ){
            if(list1.get(i)!=list2.get(i) ){
                break;
            }
        }

        return new Node(list1.get(i-1));

    }

    public boolean findElement(Node root,int n, ArrayList<Integer> list){
        if(root == null){
            return false;
        }

        list.add(root.data);

        if(root.data==n){
            return true;
        }

        if(root.left!=null && findElement(root.left,n,list) ){
            return true;
        }

        if(root.right!=null && findElement(root.right,n,list) ){
            return true;
        }

        list.remove(list.size() -1);

        return false;
    }
}