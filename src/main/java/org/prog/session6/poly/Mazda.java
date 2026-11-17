package org.prog.session6.poly;

public class Mazda implements ICar {
    @Override
    public void accelerate() {
        System.out.println("Mazda accelerate");
    }

    @Override
    public void brake() {
        System.out.println("Mazda brake");
    }

    @Override
    public void turnLeft() {
        System.out.println("Mazda turn left");
    }

    @Override
    public void turnRight() {
        System.out.println("Mazda turn right");
    }
}
