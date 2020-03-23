package com.company.OOAD.Test2_Factory_2_abstract;

abstract class Computer{
    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();

    @Override
    public String toString(){
        return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
    }
}


class Client extends Computer{

    String RAM;
    String HDD;
    String CPU;

    public Client(String RAM, String HDD, String CPU) {
        this.RAM = RAM;
        this.HDD = HDD;
        this.CPU = CPU;
    }

    @Override
    public String getRAM() {
        return RAM;
    }

    @Override
    public String getHDD() {
        return HDD;
    }

    @Override
    public String getCPU() {
        return CPU;
    }
}


class Server extends Computer{

    String RAM;
    String HDD;
    String CPU;

    public Server(String RAM, String HDD, String CPU) {
        this.RAM = RAM;
        this.HDD = HDD;
        this.CPU = CPU;
    }

    @Override
    public String getRAM() {
        return RAM;
    }

    @Override
    public String getHDD() {
        return HDD;
    }

    @Override
    public String getCPU() {
        return CPU;
    }
}


// Create Abstract Factory

interface ComputerAbstractFactory{

    Computer createComputer();

}

class ClientFactory implements ComputerAbstractFactory{

    String RAM;
    String HDD;
    String CPU;

    public ClientFactory(String RAM, String HDD, String CPU) {
        this.RAM = RAM;
        this.HDD = HDD;
        this.CPU = CPU;
    }

    @Override
    public Computer createComputer(){
        return new Client(RAM,HDD,CPU);
    }

}


class ServerFactory implements ComputerAbstractFactory{

    String RAM;
    String HDD;
    String CPU;

    public ServerFactory(String RAM, String HDD, String CPU) {
        this.RAM = RAM;
        this.HDD = HDD;
        this.CPU = CPU;
    }

    @Override
    public Computer createComputer(){
        return new Server(RAM,HDD,CPU);
    }

}

class ComputerFactory{

    public static Computer getCompuer( ComputerAbstractFactory computer ){
        return computer.createComputer();
    }

}

public class Prac1 {

    public static void main(String[] args) {

        Computer client = ComputerFactory.getCompuer(
                new ClientFactory("6 GB", "500 GB", "Intel core i 3" ) );

        Computer server = ComputerFactory.getCompuer(
                new ClientFactory("16 GB", "5 TB", "Intel core i 5" ) );

        System.out.println(client);
        System.out.println(server);

    }
}
