package org.prog.session6.inheritance;

public class Car {

    public String color;

    public Car(String color) {
        System.out.println("Creating car...");
        this.color = color;
    }

    public void goTo(String destination) {
        goTo(destination, "current location");
    }

    public void goTo(String destination, String from) {
        goTo(destination, from, "nowhere");
    }

    public void goTo(String destination, String from, String through) {
        System.out.println(color + " car goes to " + destination +
                " from " + from + " stopping at " + through);
    }

    public String getColor() {
        if (color.equals("green")) {
            return "car_" + color;
        } else {
            return "_car_" + color;
        }
    }

    public String smth() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            if (i == 5) {
                return "car_" + color;
            }
        }
        return "!!!!!!!!!!!!!!!car_" + color;
    }
}
