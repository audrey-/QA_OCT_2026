package org.prog.HW_5;

public class Main {

    public static void main(String[] args) {
        Plane Plane1 = new Plane(12, 200, 130);

        Plane1.perTakenSeats();
        Plane1.registerPass(10);
        Plane1.perTakenSeats();
    }
}