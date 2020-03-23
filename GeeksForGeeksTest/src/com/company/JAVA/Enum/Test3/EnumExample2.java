package com.company.JAVA.Enum.Test3;

enum Season{
    WINTER,
    SPRING,
    SUMMER,
    FALL
}

public class EnumExample2 {


    public static void main(String[] args) {
        for( Season s1 : Season.values() ){
            System.out.println(s1);
        }

        // Enum inside the class

        Season s1 = Season.valueOf("WINTER");

        System.out.println(s1);

        System.out.println(s1.getClass().getName());


    }

}
