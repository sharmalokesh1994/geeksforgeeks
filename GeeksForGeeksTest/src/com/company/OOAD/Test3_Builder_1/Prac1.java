package com.company.OOAD.Test3_Builder_1;

class Vehicle{

    // required Parameter
    private int wheel;
    private String name;

    // Optional Parameter
    private int airbag;

    public Vehicle(VehicleBuilder vehicleBuilder) {

        this.wheel = vehicleBuilder.wheel;
        this.name = vehicleBuilder.name;
        this.airbag=vehicleBuilder.airbag;
    }


    public int getWheel() {
        return wheel;
    }

    public String getName() {
        return name;
    }

    public int getAirbag() {
        return airbag;
    }


    static class VehicleBuilder{

        private int wheel;
        private String name;

        private int airbag=0;

        public VehicleBuilder(int wheel, String name) {
            this.wheel = wheel;
            this.name = name;
        }

        public void setAirbag(int airbag) {
            this.airbag = airbag;
        }

        public Vehicle build(){
            return new Vehicle(this);
        }
    }

}

public class Prac1 {

    public static void main(String[] args) {

        Vehicle.VehicleBuilder carBuilder = new Vehicle.VehicleBuilder(4,"Car");
        carBuilder.setAirbag(2);

        Vehicle car = carBuilder.build();

        System.out.println(car.getAirbag()+" "+car.getWheel());

        Vehicle.VehicleBuilder bikeBuilder = new Vehicle.VehicleBuilder(2,"Bike");

        Vehicle bike = bikeBuilder.build();

        System.out.println(bike.getAirbag()+" "+bike.getWheel());

    }

}
