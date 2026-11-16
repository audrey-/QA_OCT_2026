package org.prog.session3;



public class ArrayDemo {

    public static void main(String[] args) {
        String[] arr = {
                "Alice",
                "Bob",
                "Charlie",
                "Donnie",
                "Elizabeth",
                "Frank",
                "George",
                "Helen"};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("a")) {
                System.out.println(arr[i]);
            }
        }

//        int[] ints = new int[10];
//        ints[0] = -10;
//        ints[1] = 5;
//        ints[2] = -1;
//        ints[3] = 0;
//        ints[4] = 16;
//        ints[5] = 77;
//        ints[6] = -6;
//        ints[7] = 8;
//        ints[8] = 10;
//        ints[9] = 0;
//
//        for (int i = 0; i < ints.length; i++) {
//            if (ints[i] > 0) {
//                System.out.println(ints[i]);
//            } else {
//                System.out.println("Element at " + i + " is <= 0");
//            }
//        }


    }
}


/**
 *
 * 00 - 0000
 * 01 - 0001
 * 02 - 0010
 * 03 - 0011
 * 04 - 0100
 * 05 - 0101
 * 06 - 0110
 * 07 - 0111
 * 08 - 1000
 * 09 - 1001
 * 10 - 1010
 * 11 - 1011
 * 12 - 1100
 * 13 - 1101
 * 14 - 1110
 * 15 - 1111
 */