package org.prog.session5;

public class Car {
    public String color;

    public void goTo(String destination) {
        startEngine();
        System.out.println(color + " car goes to " + destination);
    }

    private void startEngine() {
        System.out.println("Check fuel");
        System.out.println("Starting engine");
    }
}
