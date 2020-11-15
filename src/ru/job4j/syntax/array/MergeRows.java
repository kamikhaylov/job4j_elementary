package ru.job4j.syntax.array;

public class MergeRows {
    public static int[] merge(int[][] data) {
        int[] rsl = new int[data.length * data.length];
        int k = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                rsl[k] = data[i][j];
                k++;
            }
        }
        return rsl;
    }
}
