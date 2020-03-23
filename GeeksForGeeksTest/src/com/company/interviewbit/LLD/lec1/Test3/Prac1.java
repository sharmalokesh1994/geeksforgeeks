package com.company.interviewbit.LLD.lec1.Test3;

enum Color{
    WHITE,
    BLACK,
    YELLOW,
    GREEN,
    PINK;

}

enum BirdType{
    HEN,
    EAGLE;
}

// blueprint of real-world entity Bird
class Bird{

    // States (property)
    Color color;
    int price;

    // Actions = Behaviour
    void fly( BirdType type ){
        System.out.println("Open Wings");

        if(type.equals(BirdType.HEN)){
            System.out.println("Flying low");
        }else if(type.equals(BirdType.EAGLE) ){
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
        hen.fly(BirdType.HEN);
        eagle.fly(BirdType.EAGLE);

        // But again a small error may give big issue again
        // eagle will fly like HEN
        eagle.fly(BirdType.HEN);

        // To avoid above errors we will use inheritance
        // Only one class should present one behaviour of the real world entity
    }

}

