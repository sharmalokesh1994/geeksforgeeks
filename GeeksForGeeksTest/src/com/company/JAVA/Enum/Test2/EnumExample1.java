package com.company.JAVA.Enum.Test2;

public class EnumExample1 {

    public enum Season{
        WINTER,
        SPRING,
        SUMMER,
        FALL
    };

    public static void main(String[] args) {

        // The Java compiler internally adds the values() method when it creates an enum.
        // The values() method returns an array containing all the values of the enum.

        // enum.values() gives array of Enums
        System.out.println(Season.values());

        for( Season s1: Season.values() ){

            System.out.println(s1);

        }

        System.out.println("---------------------------------------------------\n" +
                "Example for enum.valueOf method\n" +
                "---------------------------------------------------------------");


        //The Java compiler internally adds the valueOf() method when it creates an enum.
        // The valueOf() method returns the value of given constant enum.
        System.out.println("Value of WINTER is: "+Season.valueOf("WINTER"));

        // We can create
        Season s1 = Season.valueOf("WINTER");
        System.out.println( "Class Name of Enum : "+ s1.getClass().getName());

        //The Java compiler internally adds the ordinal() method when it creates an enum.
        // The ordinal() method returns the index of the enum value.

        System.out.println("---------------------------------------------------\n" +
                "Example for enum.ordinal method\n" +
                "---------------------------------------------------------------");

        System.out.println(" Index of s1: "+s1.ordinal());

    }

}
