package ru.job4j.array;

import java.util.Arrays;

public class ArrayWithoutEvenElements {
    public static int[] changeData(int[] data) {
        int[] result = new int[data.length];
        int k = 0;
        for (int i = 0; i < data.length; i++) {
            if ((data[i] % 2) != 0) {
                result[k] = data[i];
                k++;
            }
        }
        result = Arrays.copyOf(result, k);
        return result;
    }
}
