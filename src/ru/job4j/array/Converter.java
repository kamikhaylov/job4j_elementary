package ru.job4j.array;

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        int element = 0;
        int lengthResult = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                element++;
            }
        }

        for (int i = 0; i < element; i++) {
            if (i * i >= element) {
                lengthResult = i;
                break;
            }
        }

        int[][] result = new int[lengthResult][lengthResult];
        int k = 0;
        int m = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (k >= result.length) {
                    m++;
                    k = 0;
                }
                result[m][k] = array[i][j];
                k++;
            }
        }
        return result;
    }
}
