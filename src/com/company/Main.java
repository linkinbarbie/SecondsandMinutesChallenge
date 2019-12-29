package com.company;

public class Main {
    //this is a constant in which the variable cannot be changed.
    //constants are usually typed in upper case so that they cannot be changed
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] arg
    ) {
        System.out.println(getDurationString( 800, 53));
        System.out.println(getDurationString(7559));
        System.out.println(getDurationString(9));
        System.out.println(getDurationString(65,9));
    }





    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE ;

        } else {  //double secondsCheck = (double) seconds/60;
            int ftAnswer = minutes / 60;

            int remainingMinutes = minutes % 60;


            return ftAnswer + "h " + remainingMinutes + "m " + seconds + "s ";

        }
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;

        } else {
            int newMinutes = seconds / 60;
            int newSeconds = seconds % 60;
            return getDurationString(newMinutes, newSeconds);
        }

    }
}
