package ru.job4j.array;

public class TwoSquareArrays {
    public static int[] collectArray(int[][] left, int[][] right) {
        int[] result = new int[left.length * left.length];
        int k = 0;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i][j] >= right[i][j]) {
                    result[k] = left[i][j];
                } else {
                    result[k] = right[i][j];
                }
                k++;
            }
        }
        return result;
    }
}
