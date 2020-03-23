package com.company.java1_8.Teslusko.Test5;

import java.util.ArrayList;

public class Prac1 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int ans = 0;

        // Only final variable can be used inside for-each loop(lambda Expression)
        list.forEach( (i)-> {

            System.out.println(i);
        } );
    }

}
