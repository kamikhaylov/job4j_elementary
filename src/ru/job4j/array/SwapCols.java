package ru.job4j.array;

public class SwapCols {
    public static void swap(int[][] data, int src, int dst) {
        int[] temp = new int[data[src].length];
        for (int i = 0; i < data[src].length; i++) {
            temp[i] = data[i][src];
            data[i][src] = data[i][dst];
            data[i][dst] = temp[i];
        }
    }
}
