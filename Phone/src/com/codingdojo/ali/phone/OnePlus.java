package com.codingdojo.ali.phone;

public class OnePlus extends Phone implements Ringable {
    public OnePlus(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
    	System.out.print("OnePlus " + getVersionNumber() + " says ");
        return getRingTone();
    }
    @Override
    public String unlock() {
        return "Unlocking via fingerprint";
    }
    @Override
    public void displayInfo() {
    	System.out.println("OnePlus " + getVersionNumber() + " from " + getCarrier() + " has " + getBatteryPercentage() + "% battery charge.");       
    }
}
