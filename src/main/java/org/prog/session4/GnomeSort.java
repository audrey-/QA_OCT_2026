package org.prog.session4;

import java.util.Random;

public class GnomeSort {

    public static void main(String[] args) {
        int[] ints = new int[1000];
        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(1000);
        }

//        int[] ints = {5,4,3,2,1};

        for (int i = 0; i < ints.length; ) {
            if (i == 0) {
                i++;
            }
            if (ints[i] < ints[i - 1]) {
                int currentValue = ints[i];
                int previousValue = ints[i - 1];
                ints[i] = previousValue;
                ints[i - 1] = currentValue;
                i--;
            } else {
                i++;
            }
        }

        System.out.println("======================");

        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
