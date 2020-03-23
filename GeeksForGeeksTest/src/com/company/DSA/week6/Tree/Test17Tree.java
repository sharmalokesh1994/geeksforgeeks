package com.company.DSA.week6.Tree;


/*
****************************************************
Diameter of Binary Tree
* *************************************************
 */

/*
Given a Binary Tree, find diameter of it.
+The diameter of a tree is the number of nodes on the longest path between two leaves in the tree. The diagram below shows two trees each with diameter nine, the leaves that form the ends of a longest path are shaded (note that there is more than one path in each tree of length nine, but no path longer than nine nodes).


 */


public class Test17Tree {

    /* Complete the function to get diameter of a binary tree */
    int diameter(Node node)
    {
        // Your code here

        Height h = new Height();

        return daiMeterOf(node,h);
    }


    public static int daiMeterOf(Node node,Height h){
        if(node ==null){
            h.a = 0;
            return 0;
        }



        int ld = 0;
        int rd = 0;

        Height lh = new Height();
        Height rh = new Height();

        ld = daiMeterOf(node.left,lh);
        rd = daiMeterOf(node.right,rh);

        h.a = ((int) Math.max(lh.a,rh.a)) +1;

        int t1 = lh.a+rh.a+1;
        int t2 =(int) Math.max(ld,rd);
        return (int) Math.max(t1,t2);

    }
}

class Height{
    int a;
}
