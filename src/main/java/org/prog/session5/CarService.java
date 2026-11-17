package org.prog.session5;

public class CarService {

    void paintCar(Car carToPaint, String color) {
        System.out.println("Remove old paint");
        System.out.println("Apply new paint");
        carToPaint.color = color;
        System.out.println("Apply coating");
        System.out.println("Polish car");
        System.out.println("Car ready!");
    }

    void smth(int i) {
        i += 1000;
        System.out.println("now i = " + i);
    }
}
