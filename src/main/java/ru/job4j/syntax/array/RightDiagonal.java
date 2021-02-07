package ru.job4j.syntax.array;

public class RightDiagonal {
    public static int[] diagonal(int[][] data) {
        int[] result = new int[data.length];
        int k = data.length - 1;
        for (int i = 0; i < data.length; i++) {
            result[i] = data[i][k - i];
        }
        return result;
    }
}
