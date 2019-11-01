package com.codingdojo.ali.bicyle;

class BicycleTest {
    public static void main(String[] args) {
        Bicycle b = new Bicycle();
        // print constant
        System.out.println(Bicycle.myConstant);
        b.sayHello();
        Bicycle.staticMethod();
        b.speedUp(5);
        b.applyBrakes(4);
        System.out.println(b.getSpeed());
    }
}