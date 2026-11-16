package org.prog.session4;

public class ObjectsDemo {

    public static void main(String[] args) {
        Car myCar1 = new Car();
        Car myCar2 = new Car();
        Car myCar3 = new Car();
        Car myCar4 = new Car();
        Car myCar5 = new Car();

        myCar1.color = "red";
        myCar2.color = "green";
        myCar3.color = "blue";
        myCar4.color = "white";
        myCar5.color = "black";

        myCar1.goTo();
        myCar2.goTo();
        myCar3.goTo();
        myCar4.goTo();
        myCar5.goTo();
    }
}
