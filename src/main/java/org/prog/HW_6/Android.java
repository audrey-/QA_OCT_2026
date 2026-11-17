package org.prog.HW_6;


public class Android implements IPhone {
    @Override
    public void unlock() {
        System.out.println("Android unlocks with fingerprint");
    }
    @Override
    public void call() {

        System.out.println("Android calls");
    };
}
