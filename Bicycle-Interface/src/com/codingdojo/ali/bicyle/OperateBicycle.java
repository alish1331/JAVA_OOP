package com.codingdojo.ali.bicyle;

public interface OperateBicycle {
    // constant that is public, static, and final
    double myConstant = 3.0;
    
    // default method that does not need implementation
    default void sayHello() {
        System.out.println("Hello everybody from OperateBicycle");
    }
    
    // static method that does not need implementation
    static void staticMethod() {
        System.out.println("Hello from the static method of the interface");
    }
    void speedUp(int increment);
    void applyBrakes(int decrement);
}