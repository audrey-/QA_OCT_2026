package org.prog.session6.inheritance;

public class BigTruck extends Truck {

    public BigTruck(String color) {
        super(color);
    }

    public void addBigCargo() {
        System.out.println("Big Truck carries big cargo");
    }
}
