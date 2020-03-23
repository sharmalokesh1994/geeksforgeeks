package com.company.DSA.week6.BST;

/*
*****************************************************
Merge two BST 's
* ***************************************************
 */

/*
Given two BST, you need to print the elements of both BSTs in sorted form.
 */

import java.util.ArrayList;

public class Test16GfG {

    public static void merge(Node root1 , Node root2)
    {
        //add code here.

        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> sec = new ArrayList<>();

        inOrder(root1,first);
        inOrder(root2,sec);

        int i=0;
        int j=0;

        StringBuffer sb = new StringBuffer();

        while(i<first.size() && j<sec.size() ){
            int t1 = first.get(i);
            int t2 = sec.get(j);

            if(t1<t2){
                sb.append(t1+" ");
                i++;
            }else{
                sb.append(t2+" ");
                j++;
            }

        }

        while(i<first.size() ){
            int t1 = first.get(i);
            sb.append(t1+" ");
            i++;
        }

        while(j<sec.size() ){

            int t2 = sec.get(j);
            sb.append(t2+" ");
            j++;
        }

        System.out.print(sb);


    }


    public static void inOrder(Node root,ArrayList<Integer> arr ){
        if(root==null){
            return;
        }

        inOrder(root.left,arr);
        arr.add(root.data);
        inOrder(root.right,arr);

    }

}
