package com.company.DSA.week6.Tree.Test11Tree;

import java.util.HashMap;
import java.util.Scanner;

public class Test {
}


class Node
{
    int data;
    Node left,right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
}

class Height_Balanced_Tree
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0)
        {
            HashMap<Integer, Node> m = new HashMap<Integer, Node> ();
            int n = sc.nextInt();
            Node root = null;
            while (n > 0)
            {

                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                char lr= sc.next().charAt(0);

                //  cout << n1 << " " << n2 << " " << (char)lr << endl;
                Node parent = m.get(n1);
                if (parent == null)
                {
                    parent = new Node(n1);
                    m.put(n1, parent);
                    if (root == null)
                        root = parent;
                }
                Node child = new Node(n2);
                if (lr == 'L')
                    parent.left = child;
                else
                    parent.right = child;
                m.put(n2, child);
                n--;
            }

            Tree g = new Tree();

            if(g.isBalanced(root) == true)
                System.out.println(1);
            else
                System.out.println(0);
            t--;
        }
    }
}

class Tree
{

    /* This function should return tree if passed  tree
    is balanced, else false. */
    boolean isBalanced(Node root)
    {
        // Your code here
        if(root==null){
            return true;
        }

        Counter c = new Counter(0);

        return levelTree(root,c);
    }

    public static boolean levelTree(Node node, Counter height){

        if(node==null){
            return true;
        }


        Counter left = new Counter(0);
        Counter right = new Counter(0);



        boolean l = levelTree(node.left,left);
        boolean r = levelTree(node.right,right);

        if(left.count>=right.count){
            height.count=left.count+1;
        }else {
            height.count=right.count+1;
        }

        if((int)Math.abs(left.count-right.count)>1  ){
            return false;
        }

        return (l&r);
    }
}


class Counter {

    int count = 0;

    public Counter(int count) {
        this.count = count;
    }

    public int getCount() {
        return this.count;
    }

    public void increaseByOne() {
        count++;
    }
}
