package org.prog.HW;

public class HW_1 {public static void main(String[] args) {
    int count3 = 0;
    int count7 = 0;
    int count13 = 0;

    for (int i = 0; i <= 100; i++) {
        if (i > 0 && i % 3 == 0) {
            System.out.println( i +" - делится на 3 без остатка ");
            count3++;
        }
        if (i > 0 && i % 7 == 0) {
            System.out.println(i +" - делится на 7 без остатка ");
            count7++;
        }
        if (i > 0 && i % 13 == 0) {
            System.out.println(i +" - делится на 13 без остатка ");
            count13++;
        }
    }

    System.out.println("--- ИТОГО ---");
    System.out.println("Всего делятся на 3: " + count3);
    System.out.println("Всего делятся на 7: " + count7);
    System.out.println("Всего делятся на 13: " + count13);
}
}
