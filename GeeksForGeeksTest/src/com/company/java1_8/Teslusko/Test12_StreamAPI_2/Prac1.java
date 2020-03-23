package com.company.java1_8.Teslusko.Test12_StreamAPI_2;

// Create Filter like Stream



import org.omg.CORBA.ObjectHelper;

import java.util.ArrayList;
import java.util.function.Predicate;

class TestFilter{


    public ArrayList<Integer> filter(ArrayList<Integer> list, Predicate p){
        ArrayList<Integer> ans = new ArrayList<>();

        for( int a : list ){
            if( p.test(a) ){
                ans.add( a );
            }
        }
        return  ans;
    }


}

class Pred{

    static int val = 10;

    static public boolean check( Object a ){
        if( (Integer)a>val ){
            return true;
        }
        return false;
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

        TestFilter t = new TestFilter();

        list = t.filter(list, Pred::check);

        list.forEach(System.out::println);

    }
}
