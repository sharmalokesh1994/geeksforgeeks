package com.company.JAVA.Enum.Test7;

enum TrafficSignal{
    RED("STOP",1),
    GREEN("GO",2),
    YELLOW("SLOW",3);

    String action ="";
    private int val = 0;
    TrafficSignal(String action,int val){
        this.action = action;
        this.val = val;
    }

    TrafficSignal(String action){
        this.action = action;
    }
    // We can not access private method from outside so we have to create getter method


    int getVal(){
        return this.val;
    }

}

public class EnumConstructorExample{
    public static void main(String[] args) {

        TrafficSignal t1[] = TrafficSignal.values();

        for( TrafficSignal t : t1 ){
            System.out.println(t.action+" : "+t.getVal());
        }

    }
}
