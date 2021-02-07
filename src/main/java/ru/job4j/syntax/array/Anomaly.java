package ru.job4j.syntax.array;

import static java.util.Arrays.copyOf;

public class Anomaly {
    public static int[][] found(int[] data, int up, int down) {
        int[][] result = new int[data.length][2];
        int count = 0;
        int k = 0;

        for (int i = 0; i < data.length; i++) {
            if (data[i] <= 4 || data[i] >= 16) {
                result[count][k] = i;
                k++;
            }
            if (k >= 2) {
                count++;
                k = 0;
            }
            if ((i == data.length - 1) && count == 0) {
                result[count][1] = result[count][0];
            }
        }

        result = copyOf(result, count + k);

        return result;
    }
}