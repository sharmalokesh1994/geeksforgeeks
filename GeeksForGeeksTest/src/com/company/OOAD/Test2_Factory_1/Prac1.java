package com.company.OOAD.Test2_Factory_1;

abstract class Vehicle{

    abstract int getWheel();
}

class Car extends Vehicle{

    int wheel = 0;

    Car(int wheel){
        this.wheel = wheel;
    }

    public int getWheel(){
        return this.wheel;
    }
}

class Bike extends Vehicle{

    int wheel = 0;

    Bike(int wheel){
        this.wheel = wheel;
    }

    public int getWheel(){
        return this.wheel;
    }
}

class VehicleFactory{

    static Vehicle getVehicle(String type,int wheel ){

        if(type=="car"){
            return new Car(wheel);
        }

        if(type=="bike"){
            return new Bike(wheel);
        }

        return null;
    }

}

public class Prac1 {

    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getVehicle("car",4);
        System.out.println(car.getWheel());

        Vehicle bike = VehicleFactory.getVehicle("bike",2);
        System.out.println(bike.getWheel());
    }

}
