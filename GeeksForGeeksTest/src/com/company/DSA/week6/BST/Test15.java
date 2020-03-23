package com.company.DSA.week6.BST;

/*

 */

public class Test15 {
    public static int getCountOfNode(Node root,int l, int h)
    {
        //Your code here

        if(root == null){
            return 0;
        }


        int ans =0;

        ans = ans + getCountOfNode(root.left,l,h);
        ans = ans + getCountOfNode(root.right,l,h);

        if(root.data<=h && root.data>=l){
            ans++;
        }

        return ans;

    }


}
