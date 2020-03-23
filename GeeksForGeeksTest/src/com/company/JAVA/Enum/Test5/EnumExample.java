package com.company.JAVA.Enum.Test5;

enum Season{
    WINTER(5), SPRING(10), SUMMER(15), FALL(20);

    int value;


    // by Default private constructor will be created
    Season(int i) {
        this.value = i;
    }
}

public class EnumExample {

    public static void main(String[] args) {
        for( Season s1 : Season.values() ){
            System.out.println(s1+" : "+ s1.value+" : "+ s1.ordinal());
        }

        Season s1 = Season.valueOf("WINTER");
        System.out.println(s1);

    }

}
