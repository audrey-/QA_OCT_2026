package org.prog.session2;

//TODO: write for 0...100
//TODO: count numbers that can be divided by 3 fully
//TODO: count numbers that can be divided by 7 fully
//TODO: count numbers that can be divided by 13 fully

public class ForDemo {

    public static void main(String[] args) {
        int j = 0;
        String someString = "abcdefg";
        for (int i = 0; i < 100; i = i + 1) {
            if (i <= 10) {
                System.out.println("i was under 10");
            }
            if (i > 10 && i < 80) {
                System.out.println("i was between 10 and 80");
            }
            if (i >= 80) {
                System.out.println("i was 80 or more");
            }
        }

        System.out.println(someString);
    }
}
