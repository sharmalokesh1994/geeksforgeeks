package com.company.java1_8.Teslusko.Test8;

import java.util.ArrayList;
import java.util.function.Consumer;

class Cons implements Consumer<Integer>{

    @Override
    public void accept(Integer integer) {
        System.out.println(integer);
    }
}

public class Prac1 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        Cons c = new Cons();

        // It calls consumer interface inside this
        list.forEach(c);

    }

}
