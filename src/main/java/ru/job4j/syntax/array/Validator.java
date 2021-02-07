package ru.job4j.syntax.array;

public class Validator {
    public static boolean checkArray(int[] data, int value) {
        int element = 0;
        for (int datum : data) {
            if (value == datum) {
                element++;
            }
        }
        if (element >= data.length / 2) {
            return false;
        }
        return true;
    }
}