package com.company.java1_8.Teslusko.Test9;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Prac1 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        Consumer<Integer> c = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        } ;

        // It calls consumer interface inside this
        list.forEach(c);



    }

}
