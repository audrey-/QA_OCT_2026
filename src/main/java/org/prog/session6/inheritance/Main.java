package org.prog.session6.inheritance;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("red");
        car.goTo("Kyiv");
        car.goTo("Odessa", "Lviv");
        car.goTo("Dnipro", "Lviv", "Kyiv");

//        BigTruck bigTruck = new BigTruck("yellow");
//        bigTruck.goTo("test!");
//
//        Truck truck = new Truck("green");
//        truck.goTo("test!");
//
//        Crossover crossover = new Crossover("red");
//        crossover.goTo("test!");
    }
}
