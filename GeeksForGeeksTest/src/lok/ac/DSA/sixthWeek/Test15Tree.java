package lok.ac.DSA.sixthWeek;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;


/*
***************************************************************
Bottom View of Binary Tree
***************************************************************
 */

/*
Given a binary tree, print the bottom view from left to right.
A node is included in bottom view if it can be seen when we look at the tree from bottom.

                      20
                    /    \
                  8       22
                /   \        \
              5      3       25
                    /   \
                  10    14

For the above tree, the bottom view is 5 10 3 14 25.
If there are multiple bottom-most nodes for a horizontal distance from root, then print the later one in level traversal. For example, in the below diagram, 3 and 4 are both the bottommost nodes at horizontal distance 0, we need to print 4.

                      20
                    /    \
                  8       22
                /   \     /   \
              5      3 4     25
                     /    \
                 10       14
 */

/**
 * Created by Lokesh Sharma on 27-07-2019.
 */
public class Test15Tree {


    // Should print bottom view of tree with given root
    public void bottomView(Node root)
    {
        // Your code here

        TreeMap<Integer,Node> tMap = new TreeMap<>();

        Queue<Node> q = new LinkedList<>();

        root.hd = 0;

        q.add(root);

        while(!q.isEmpty() ){
            Node n = q.poll();

            tMap.put(n.hd,n);


            if(n.left!=null){
                Node t = n.left;
                t.hd = n.hd-1;

                q.add(t);
            }


            if(n.right!=null){
                Node t = n.right;

                t.hd = n.hd+1;

                q.add(t);
            }



        }

        for(int a : tMap.keySet() ){
            System.out.print(tMap.get(a).data +" ");
        }


    }
}



class Node {
    int data; //data of the node
    int hd; //horizontal distance of the node
    Node left, right; //left and right references
    public Node(int key)
    {
        data = key;
        hd = Integer.MAX_VALUE;
        left = right = null;
    }
}