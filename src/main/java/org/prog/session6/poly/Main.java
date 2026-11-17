package org.prog.session6.poly;

// TODO: Write Android and Apple class
// TODO: Each class must implement interface IPhone
// TODO: IPhone interface must have method to unlock and call
// TODO: Android unlocks with fingerprint, Apple unlocks with faceId
// TODO: Call acts the same
// TODO: add emthod unlockAndCall that will use IPhone unlock() and call()

public class Main {

    public static void main(String[] args) {
        Mazda mazda = new Mazda();
        Ford Ford = new Ford();
        drive(mazda);
        drive(Ford);
    }

    public static void drive (ICar car) {
        car.accelerate();
        car.turnRight();
        car.turnLeft();
        car.brake();
    }
}
