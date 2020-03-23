package com.company.DSA.week6.Tree;

/*
********************************************************
Check if subtree
* ******************************************************
 */

/*
Given two binary trees with head reference as T and S having at most N nodes. The task is to check if S is present as subtree in T.
A subtree of a tree T1 is a tree T2 consisting of a node in T1 and all of its descendants in T1.
 */

public class Test21Tree {

    public static boolean isSubtree(Node T, Node S) {
        // add code here.
        if(S==null){
            return true;
        }
        if(T==null){
            return false;
        }

        if(identical(T,S) ){
            return true;
        }


        return isSubtree(T.left,S) || isSubtree(T.right,S);
    }

    public static boolean identical(Node T, Node S){


        if(T==null && S ==null){
            return true;
        }

        if(T==null || S==null){
            return false;
        }


        return (T.data==S.data && identical(T.left,S.left) && identical(T.right,S.right) );

    }
}
