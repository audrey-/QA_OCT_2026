package org.prog.session5;

//TODO: add class Plane
//TODO: plane must have flightId
//TODO: plane must have maximum passenger seats
//TODO: plane must have taken passenger seats
//TODO: add method that will say flight number ### has ##% seats taken
//TODO: * - add method register passengers int passengers. If too many passengers - print "not enough seats", and decline boarding (no passengers added)

public class Main {

    /**
     * ###[carService@CarService]###
     * #############################
     * ####[myCar1@Car]#############
     * #############################
     * ####[myCar2@Car]#############
     * #[immutabledata@Data]########
     * =============================
     * ######10############1010#####
     */

    public static void main(String[] args) {
        CarService carService = new CarService();
//        int i = 10;
//        System.out.println("i before service: " + i);
//        carService.smth(i);
//        System.out.println("i after service: " + i);

        Car myCar1 = new Car();
        Car myCar2 = new Car();
        Car thatCar = myCar1;

        System.out.println("===========================");

        Crossover crossover = new Crossover();
        crossover.color = "yellow";
        crossover.goTo("Lviv");
        crossover.mode4x4();

        System.out.println("===========================");

        Truck truck = new Truck();
        truck.color = "green";
        truck.goTo("Odessa");
        truck.mode4x4();
        truck.addCargo();

        carService.paintCar(thatCar, "black");
        carService.paintCar(myCar2, "red");

        System.out.println("============================");

        myCar1.goTo("Odessa");
        myCar1.goTo("Kyiv");

        myCar2.goTo("Lviv");
        myCar2.goTo("Dnipro");
    }
}
