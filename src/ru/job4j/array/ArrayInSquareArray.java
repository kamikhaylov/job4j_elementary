package ru.job4j.array;

public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        int lengthResult = 0;
        for (int i = 0; i < array.length; i++) {
            if (i * i >= array.length) {
                lengthResult = i;
                break;
            }
        }
        int[][] result = new int[lengthResult][lengthResult];
        int k = 0;
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length && k < array.length; j++) {
                result[i][j] = array[k];
                k++;
            }
        }
        return result;
    }
}
