package ru.job4j.syntax.array;

public class EvenSumElements {
    public static boolean checkArray(int[] data) {
        int sum = 0;
        for (int datum : data) {
            sum += datum;
        }
        if ((sum % 2) == 0) {
            return true;
        }
        return false;
    }
}
