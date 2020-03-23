package com.company.JAVA.Enum.Test4;

public enum Season {

    WINTER,
    SUMMER,
    SPRING,
    FALL;

    public static void main(String[] args) {

        for( Season s1 : Season.values() ){
            System.out.println(s1);
        }

    }

}
