package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean reference = data[0];
        for (boolean datum : data) {
            if (reference != datum) {
                return false;
            }
        }
        return true;
    }
}
