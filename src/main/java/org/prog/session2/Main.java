package org.prog.session2;

public class Main {

    public static void main(String[] args) {
        int i = 10;
        int j = 11;
        int k = 12;

        boolean b = false;

//        System.out.println(i == j && i == k && j == k);
//        System.out.println(i == j || i == k || j == k);

        b = i <= 10 && j >= 11 && k == 13;

        if (i <= 10 && j >= 11 && k == 13) {
            System.out.println("i was <= 10");
            System.out.println("j was >= 11");
            System.out.println("k was == 12");
        } else {
            System.out.println("One or more conditions not fulfilled");
        }

        if (i <= 9 || j >= 12 || k == 12) {
            System.out.println("One of following was true:");
            System.out.println("i was <= 9");
            System.out.println("j was >= 12");
            System.out.println("k was == 12");
        } else {
            System.out.println("One or more conditions not fulfilled");
        }

        if (j == 10) {
            System.out.println("Run if i == 10");
        }

        String fileFormat = "mp3";
        if (fileFormat == "mp4") {
            System.out.println("File format is mp4, play as mp4");
        } else if (fileFormat == "mkv") {
            System.out.println("File format is mkv, play as mkv");
        } else if (fileFormat == "avi") {
            System.out.println("File format is avi, play as avi");
        } else if (fileFormat == "mov") {
            System.out.println("File format is mov, play as mov");
        }
    }
}
