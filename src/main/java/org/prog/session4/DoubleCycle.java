package org.prog.session4;

public class DoubleCycle {

    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            if (i == 5) {
//                break;
//            }
//            System.out.println("i = " + i);
//        }

        for (int i = 0; i < 10; i++) {
            if (i == 3 || i == 8) {
                continue;
            }
            System.out.println("i = " + i);
        }

//
//
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                System.out.println("i " + i + " : j " + j);
//            }
//        }
//        boolean isSorted = true;
//        while (isSorted) {
//            for (int i = 0; i < 10; i++) {
//                isSorted = false;
//            }
//        }
    }
}
