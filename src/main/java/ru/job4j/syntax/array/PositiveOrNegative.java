package ru.job4j.syntax.array;

public class PositiveOrNegative {
    public static boolean check(int[] data) {
        boolean result = false;
        int negative = 0;
        int positive = 0;

        for (int datum : data) {
            if (datum > 0) {
                positive++;
            } else {
                negative++;
            }
        }

        if ((positive % 2) == 0) {
            result = false;
        } else if ((negative % 2) != 0) {
            result = true;
        }

        return result;
    }
}
