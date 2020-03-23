package lok.ac;

import java.util.ArrayList;

/**
 * Created by Lokesh Sharma on 27-07-2019.
 */
public class test2 {


    public static void main(String[] args) {
        Node a = new Node(10);

        a.left = new Node(20);

        a.right = new Node(40);

        a.left.left = new Node(30);

        a.right.right = new Node(50);

        test2 t =new test2();

        System.out.println(t.lca(a,30,50).data);
    }


    Node lca(Node root, int n1,int n2)
    {
        // Your code here

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        findElement(root,n1,list1);
        findElement(root,n2,list2);

        int i=0;
        for(;i<list1.size() && i<list2.size();i++ ){
            if(list1.get(i)==list2.get(i) ){
                break;
            }
        }

        return new Node(list1.get(i));

    }

    public boolean findElement(Node root,int n, ArrayList<Integer> list){
        if(root == null){
            return false;
        }

        if(root.data==n){
            list.add(root.data);
            return true;
        }

        if(root.left!=null && findElement(root.left,n,list) ){
            list.add(root.data);
            return true;
        }

        if(root.right!=null && findElement(root.right,n,list) ){
            list.add(root.data);
            return true;
        }


        return false;
    }
}

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
