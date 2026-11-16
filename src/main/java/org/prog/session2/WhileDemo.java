package org.prog.session2;

public class WhileDemo {

    public static void main(String[] args) {
        int i = 100;
        int j = 100;

        while (i < 10) {
            System.out.println("i = " + i);
            i = i + 1;
        }

        System.out.println("==========================");

        do {
            System.out.println("j = " + j);
            j = j + 1;
        } while (j < 10);
    }
}
