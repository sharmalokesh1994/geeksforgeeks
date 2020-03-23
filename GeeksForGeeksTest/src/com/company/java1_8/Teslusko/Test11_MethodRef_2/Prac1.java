package com.company.java1_8.Teslusko.Test11_MethodRef_2;

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

        Parser p =  (s)-> {
                            return StringParser.parseValue(s);
                            };


        SaveValue sVal = new SaveValue();
        sVal.print(str,p);


        // if single statement
        sVal.print(str, s-> StringParser.parseValue(s));

    }




}
