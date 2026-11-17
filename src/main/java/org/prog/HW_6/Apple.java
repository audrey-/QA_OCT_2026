package org.prog.HW_6;



public class Apple implements IPhone {
    @Override
    public void unlock() {
        System.out.println("Apple unlocks with faceId");
    }
    @Override
    public void call() {

        System.out.println("Apple calls");
    };
}
