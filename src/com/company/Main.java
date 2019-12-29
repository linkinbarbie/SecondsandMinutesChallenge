package com.company;

public class Main {

    public static void main(String[] arg
    ) {
        getDurationString(800, 59);
        getDurationString(7559);
    }

    public static int getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            System.out.println("Invalid Value");
            return -1;
        } else {  //double secondsCheck = (double) seconds/60;
            int ftAnswer = minutes / 60;

            int remainingMinutes = minutes % 60;

            System.out.println(ftAnswer + "h " + remainingMinutes + "m " + seconds + "s ");
            return ftAnswer;

        }
    }

    public static int getDurationString(int seconds) {
        if (seconds < 0) {
            System.out.println("Invalid value");
            return -1;

        } else {
            int newMinutes = seconds / 60;
            int newSeconds = seconds % 60;
            return getDurationString(newMinutes, newSeconds);
        }

    }
}
