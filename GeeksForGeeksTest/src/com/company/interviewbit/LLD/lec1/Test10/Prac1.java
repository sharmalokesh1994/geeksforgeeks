package com.company.interviewbit.LLD.lec1.Test10;

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
    private Color color;
    private int price;

    // Actions = Behaviour
    void fly( ){
        System.out.println("Open Wings");
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {

        this.price = price;
        if(price<10){
            this.price = 10;
        }
    }
}

// This class will show the behaviour of Hen only
class Hen extends Bird implements BirdInt{
    private Color color;
    private int price;

    public void fly( ){
        super.fly();
        System.out.println("Flying low");
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {

        this.price = price;
        if(price<10){
            this.price = 10;
        }
    }

}

// This class will show the behaviour of Hen only
class Eagle extends Bird implements BirdInt{
    private Color color;
    private int price;

    public void fly( ){
        super.fly();
        System.out.println("Flying high");
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {

        this.price = price;
        if(price<10){
            this.price = 10;
        }
    }

}


// This class will show the behaviour of Hen only
class Crow extends Bird implements BirdInt{
    private Color color;
    private int price;

    public void fly( ){
        super.fly();
        System.out.println("Flying med");
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {

        this.price = price;
        if(price<10){
            this.price = 10;
        }
    }

}

class Seller{

    // This is runtime polly-morphism
    // because sell will get to know about bird during runtime
    public void sell(Bird b){

        // We do not have any control on the price
        // for this we will use encapsulation
        b.setPrice(-10);

        System.out.println( "Sold in : " + b.getPrice() );
    }

}

public class Prac1 {

    public static void main(String[] args) {

        // this will be compile time binding
        // because hen know the bird type during compile time itself
        Bird hen = new Hen();
        Bird eagle = new Eagle();

        hen.setPrice(20);
        eagle.setPrice(30);

        hen.fly();
        eagle.fly();

        Bird crow = new Crow();
        crow.fly();
        crow.setPrice(5);

        Seller seller = new Seller();
        seller.sell(hen);
        seller.sell(eagle);
        seller.sell(crow);

    }

}
