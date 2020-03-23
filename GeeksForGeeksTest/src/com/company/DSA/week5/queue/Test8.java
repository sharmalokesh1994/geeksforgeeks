package com.company.DSA.week5.queue;

import java.util.LinkedList;
import java.util.Queue;

/*
Generate Binary Numbers
 */

/*
Given a number N. The task is to generate and print all binary numbers with decimal values from 1 to N.
 */

public class Test8 {

    static void generate(long n)
    {
        // Your code here
        Queue<String> q1 = new LinkedList<>();
        q1.add(1+"");
        System.out.print( generateNo(n,q1) );

    }

    static String generateNo(long n, Queue<String> q)
    {
        // Your code here

        if(n==0){
            return "";
        }

        StringBuffer sb = new StringBuffer();

        Queue<String> q1 = new LinkedList<>();
        int i=0;
        while( !q.isEmpty() && i<n ){
            i++;
            String s = q.poll();
            q1.add( s+"0" );
            q1.add(s+"1");
            sb.append(s+" ");
        }

        if(i>=n){
            return sb.toString();
        }else{
            String s = generateNo(n-i,q1 );
            sb.append( s );
            return sb.toString();
        }

    }

}