package com.company.java1_8.Teslusko.Test11_MethodRef_1;


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


        // Using Annonyms class
        String str = "Lokesh Sharma";

        Parser p = new Parser() {
            @Override
            public String parse(String str) {
                return StringParser.parseValue(str);
            }
        };

        SaveValue sVal = new SaveValue();
        sVal.print(str,p);


        // Both are similar
        sVal.print(str,
                new Parser() {
                    @Override
                    public String parse(String str) {
                        return StringParser.parseValue(str);
                    }
                });

    }




}
