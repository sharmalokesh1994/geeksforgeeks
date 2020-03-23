package com.company.java1_8.Teslusko.Test11_MethodRef_4;

import java.util.ArrayList;
import java.util.function.Consumer;

class Sum{
    int sum = 0;

    public void sumValue(int a){
        sum = sum+a;
    }

    int getSum(){
        return sum;
    }

}

public class Prac1 {

    public static void main(String[] args) {



        ArrayList<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(6);
        list.add(9);
        list.add(14);
        list.add(41);

        Sum sum = new Sum();

        list.forEach( sum::sumValue );

        System.out.println(sum.getSum());


        // We can create lambda Expression in this manner as well
        Consumer<Integer> cons = s ->sum.sumValue(s);

        list.forEach( cons );
        System.out.println(sum.getSum());


        // We can create lambda Expression in this manner as well
        Consumer<Integer> cons1 = sum::sumValue;

        list.forEach( cons1 );
        System.out.println(sum.getSum());

    }

}
