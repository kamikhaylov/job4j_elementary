package ru.job4j.syntax.array;

public class SwapRows {
    public static void swap(int[][] data, int src, int dst) {
        int[] temp = new int[data[src].length];
        for (int i = 0; i < data[src].length; i++) {
            temp[i] = data[src][i];
            data[src][i] = data[dst][i];
            data[dst][i] = temp[i];
        }
    }
}