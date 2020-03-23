package com.company.OOAD.Structural.Test7_Bridge_1;

// It connects two hierarchy
abstract class TV{

    TVRemote remote;

    TV(TVRemote remote){
        this.remote = remote;
    }

    abstract void on();
    abstract void off();


}

interface TVRemote{
    void on();
    void off();
}


class SonyTV extends TV{

    TVRemote remote;

    SonyTV(TVRemote remote) {
        super(remote);
        this.remote = remote;
    }

    @Override
    void on() {
        remote.on();
    }

    @Override
    void off() {
        remote.off();
    }
}

class LGTV extends TV{

    TVRemote remote;
    LGTV(TVRemote remote) {
        super(remote);
        this.remote = remote;
    }

    @Override
    void on() {
        remote.on();
    }

    @Override
    void off() {
        remote.off();
    }
}

class OldRemote implements TVRemote{

    @Override
    public void on() {
        System.out.println("OLD Remote making TV on");
    }

    @Override
    public void off() {
        System.out.println("OLD Remote making TV off");
    }
}

class NewRemote implements TVRemote{

    @Override
    public void on() {
        System.out.println("New Remote making TV on");
    }

    @Override
    public void off() {
        System.out.println("New Remote making TV off");
    }
}

public class Prac1 {

    public static void main(String[] args) {

        TV tv = new SonyTV(new OldRemote());
        tv.on();
        tv.off();

        tv = new SonyTV(new NewRemote());
        tv.on();
        tv.off();

    }

}
