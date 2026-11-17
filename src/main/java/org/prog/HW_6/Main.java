package org.prog.HW_6;
// TODO: Write Android and Apple class
// TODO: Each class must implement interface IPhone
// TODO: IPhone interface must have method to unlock and call
// TODO: Android unlocks with fingerprint, Apple unlocks with faceId
// TODO: Call acts the same
// TODO: add emthod unlockAndCall that will use IPhone unlock() and call()

public class Main {
    public static void main(String[] args) {
        Apple apple17 = new Apple();
        Android sumsung26=new Android();
        apple17.call();
        sumsung26.call();
        apple17.unlock();
        sumsung26.unlock();
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        unlockAndCall(apple17);
        unlockAndCall(sumsung26);
    }
        public static void unlockAndCall (IPhone IPhone){
            IPhone.unlock();
            IPhone.call();

    }

}
