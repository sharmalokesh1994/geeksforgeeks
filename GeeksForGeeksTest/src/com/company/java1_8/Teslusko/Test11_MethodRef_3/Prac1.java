package com.company.java1_8.Teslusko.Test11_MethodRef_3;

@FunctionalInterface
interface Parser{

    String parse(String str);
}

class StringParser{

    // Any method
    public static String parseValue(String str){
        return str.toUpperCase();
    }
    public String parseValueLower(String str){
        return str.toLowerCase();
    }

}

class SaveValue{

    public void print(String str, Parser p){

        String s = p.parse(str);
        System.out.println(s);
    }

}

public class Prac1 {

    public static void main(String[] args) {


        String str = "Lokesh Sharma";


        SaveValue sVal = new SaveValue();
        // Using Method Reference for Static variable
        sVal.print(str, StringParser::parseValue );

        StringParser stringParser = new StringParser();

        // Non Static variable, by using Object (We have to create object for it)
        sVal.print(str, stringParser::parseValueLower  );

    }

}
