package com.company.DSA.week6.Tree;


/*
*********************************************
Preorder Traversal
* *******************************************
 */

/*
Given a binary tree, print preorder traversal of it. The task is to complete the function preorder(), which accept root of the tree as argument.
For example: preorder traversal of below tree is "1 10 5 39"

        1
     /     \
   10     39
  /
5

Input:
The first line of input contains T, denoting the number of testcases. Each testcase contains two lines. The first line contains number of edges in a tree. The second line contains number of edges+1 number of nodes. The struct Node has a data part which stores the data, pointer to left child and pointer to right child.

Output:
The function should print preorder traversal.

User Task:
Since this is a functional problem you don't have to worry about input, you just have to complete the function preorder() that prints the data in preorder way. The newline is automatically appended by the driver code.

Constraints:
1 <= T <= 30
1 <= Number of nodes <= 100
1 <= Data of a node <= 1000

Example:
Input:
2
2
1 2 R 1 3 L
4
10 20 L 10 30 R 20 40 L 20 60 R

Output:
1 3 2
10 20 40 60 30
 */










class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}

/*
class Main
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
                char lr = sc.next().charAt(0);


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
            g.preorder(root);
            System.out.print("
                    ");
                    t--;
        }
    }
}
}
/*This is a function problem.You only need to complete the function given below*/
/* A Binary Tree node
class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

public class Test1Tree {

    void preorder(Node root)
    {
        // Your code goes here

        if(root==null){
            return;
        }

        System.out.print(root.data+" ");

        preorder(root.left);
        preorder(root.right);


    }
}
