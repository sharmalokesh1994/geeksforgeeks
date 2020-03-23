package com.company.interviewbit.LLD.lec1.Test8;

enum Color{
    WHITE,
    BLACK,
    YELLOW,
    GREEN,
    PINK;

}

interface BirdInt{
    void fly();
}

// blueprint of real-world entity Bird
class Bird{

    // States (property)
    Color color;
    int price;

    // Actions = Behaviour
    void fly( ){
        System.out.println("Open Wings");
    }

}

// This class will show the behaviour of Hen only
class Hen extends Bird implements BirdInt{
    Color color;
    int price;

    public void fly( ){
        super.fly();
        System.out.println("Flying low");
    }

}

// This class will show the behaviour of Hen only
class Eagle extends Bird implements BirdInt{
    Color color;
    int price;

    public void fly( ){
        super.fly();
        System.out.println("Flying high");
    }

}


// This class will show the behaviour of Hen only
class Crow extends Bird implements BirdInt{
    Color color;
    int price;

    public void fly( ){
        super.fly();
        System.out.println("Flying med");
    }

}

class Seller{

    // This is runtime polly-morphism
    // because sell will get to know about bird during runtime
    public void sell(Bird b){

        System.out.println( "Sold in : " + b.price );
    }

}

public class Prac1 {

    public static void main(String[] args) {

        // this will be compile time binding
        // because hen know the bird type during compile time itself
        Bird hen = new Hen();
        Bird eagle = new Eagle();

        hen.price = 20;
        eagle.price = 30;

        hen.fly();
        eagle.fly();

        Bird crow = new Crow();
        crow.fly();
        crow.price = 5;

        Seller seller = new Seller();
        seller.sell(hen);
        seller.sell(eagle);
        seller.sell(crow);

    }

}
