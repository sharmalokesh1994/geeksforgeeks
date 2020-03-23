package com.company.java1_8.Teslusko.Test12_StreamAPI_3;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Prac1 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(6);
        list.add(9);
        list.add(14);
        list.add(41);

        Stream<Integer> stream = list.stream();

        //Intermediate function of Stream
        stream = stream.map( p-> p+10);

        // terminate function of Stream
        stream.forEach(System.out::println);


    }
}
