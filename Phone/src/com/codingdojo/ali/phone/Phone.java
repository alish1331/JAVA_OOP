package com.codingdojo.ali.phone;

public abstract class Phone {
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;
    
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }
    
  //Implementation of getters:
  	public String getVersionNumber() {
  		return versionNumber;
  	}
  	public int getBatteryPercentage() {
  		return batteryPercentage;
  	}
  	public String getCarrier() {
  		return carrier;
  	}
  	public String getRingTone() {
  		return ringTone;
  	}
  	
  	//Implementation of setters:
  	public void setVersionNumber(String versionNumber) {
  		this.versionNumber = versionNumber;
  	}
  	public void setBatteryPercentage(int batteryPercentage) {
  		this.batteryPercentage = batteryPercentage;
  	}
  	public void setCarrier(String carrier) {
  		this.carrier = carrier;
  	}
  	public void setRingTone(String ringTone) {
  		this.ringTone = ringTone;
  	}
  	
    // Abstract method. This method will be implemented by the subclasses
    public abstract void displayInfo();
}