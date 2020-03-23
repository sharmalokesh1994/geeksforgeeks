package com.company.interviewbit.LLD.lec1.Test2;

enum Color{
    WHITE,
    BLACK,
    YELLOW,
    GREEN,
    PINK;

}

// blueprint of real-world entity Bird
class Bird{

    // States (property)
    Color color;
    int price;

    // Actions = Behaviour
    void fly( String type ){
        System.out.println("Open Wings");

        if(type.equals("hen")){
            System.out.println("Flying low");
        }else if(type.equals("eagle") ){
            System.out.println("Flying high");
        }

    }

}

public class Prac1 {

    public static void main(String[] args) {

        // Creating Different Object of the class (Real world object)

        Bird hen = new Bird();
        Bird eagle = new Bird();

        // Here hen and eagle are flying differently
        hen.fly("hen");
        eagle.fly("eagle");

        // below code will not work because of small manual error
        // for solving this we will use enum
        eagle.fly("eagles");
    }

}

