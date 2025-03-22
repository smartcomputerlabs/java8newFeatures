package org.javacommunity.design;

public class StrategyPattern {
    // See before Java8 implementation without using lambda https://en.wikipedia.org/wiki/Strategy_pattern
    // below is the implementation after Java8 using lambda
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.createTyres(() -> "Car with 4 Tyres");
        vehicle.createTyres(() -> "Cycle with 2 Tyres");
    }
}
