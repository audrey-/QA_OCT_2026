package org.prog.session6.inheritance;

public class Crossover extends Car {

    public Crossover(String color) {
        super(color);
    }

    public void switchTo4x4() {
        System.out.println("Crossover switchTo4x4");
    }
}
