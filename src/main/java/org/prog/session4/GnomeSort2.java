package org.prog.session4;

import java.util.Random;

public class GnomeSort2 {

    public static void main(String[] args) {
        int[] ints = new int[1000];
        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(1000);
        }

        int i = 0;
        while (i < ints.length) {
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
        
        for (int j = 0; j < ints.length; j++) {
            System.out.println(ints[j]);
        }
    }
}
