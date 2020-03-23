package com.company.interviewbit.LLD.lec1.Test1;

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
    void fly(){
        System.out.println("Open Wings");
        System.out.println("Flying");
    }

}

public class Prac1 {

    public static void main(String[] args) {

        // Creating Different Object of the class (Real world object)

        Bird hen = new Bird();
        Bird eagle = new Bird();

        // Here eagle and hen are flying in same manner
        // But in real world entity it does not happen
        // So we have to change the code
        hen.fly();
        eagle.fly();

    }

}
