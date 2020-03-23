package com.company.OOPS.Test4_Association.Test2;

// In Aggregation both the object have more strong relationship
// for example mobile and battery
// Mobile have ownership
// but mobile will get damage than it might be possible that battery is still working fine
// So we need not to delete Battery
// Here both are independent but Mobile have ownership

class Mobile{
    String MobileNo;

    Battery battery;

    public Mobile(String mobileNo, Battery battery) {
        MobileNo = mobileNo;
        this.battery = battery;
    }

    public String getMobileNo() {
        return MobileNo;
    }

    public void setMobileNo(String mobileNo) {
        MobileNo = mobileNo;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }
}

class Battery{
    String BatteryNo;

    public String getBatteryNo() {
        return BatteryNo;
    }

    public void setBatteryNo(String batteryNo) {
        BatteryNo = batteryNo;
    }
}

public class Test1 {

    public static void main(String[] args) {
        Battery bat = new Battery();
        bat.setBatteryNo("B123");
        Mobile mob = new Mobile("M123",bat);
    }

}
