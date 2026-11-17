package org.prog.session6.inheritance;

public class Truck extends Crossover {

    public Truck(String color) {
        super(color);
    }

    @Override
    public void goTo(String destination) {
        System.out.println(color + " truck goes to " + destination + " with cargo");
    }

    public void addCargo(String cargo) {
        System.out.println("Truck carries " + cargo);
    }
}
