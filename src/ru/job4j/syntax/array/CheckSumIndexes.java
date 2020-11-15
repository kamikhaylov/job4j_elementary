package ru.job4j.syntax.array;

import java.util.Arrays;

public class CheckSumIndexes {
    public static int[] collectNewArray(int[][] data, int sum) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (i + j == sum) {
                    data[i][j] = 0;
                }
            }
        }
        int[] result = new int[data.length * data[0].length];
        int k = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                if (data[i][j] != 0) {
                    result[k] = data[i][j];
                    k++;
                }
            }
        }
        result = Arrays.copyOf(result, k);
        return result;
    }
}