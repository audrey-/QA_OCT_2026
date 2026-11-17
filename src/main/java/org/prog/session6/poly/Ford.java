package org.prog.session6.poly;

public class Ford implements ICar {
    @Override
    public void accelerate() {
        System.out.println("Ford accelerate");
    }

    @Override
    public void brake() {
        System.out.println("Ford brake");
    }

    @Override
    public void turnLeft() {
        System.out.println("Ford turn left");
    }

    @Override
    public void turnRight() {
        System.out.println("Ford turn right");
    }
}
