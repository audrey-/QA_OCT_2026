package org.prog.HW;
import java.util.Random;

public class Buble {
    public static void main(String[] args) {
        int[] ints = new int[1000];
        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(1000);
        }
        // int[] ints = {5, 4, 3, 2, 1};


        for (int i = 1; i < ints.length; i++) {

            for(int j = 1; j < ints.length; j++ ) {

                if (ints[j] < ints[j - 1]) {
                    int currentValue = ints[j];
                    int previousValue = ints[j - 1];
                    ints[j] = previousValue;
                    ints[j - 1] = currentValue;


                }
            }

        }

        System.out.println("======================");

        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }



    }
}
