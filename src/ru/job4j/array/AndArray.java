package ru.job4j.array;

import java.util.Arrays;

public class AndArray {
    public static int[] and(int[] left, int[] right) {
        int resultLength = 0;
        if (left.length >= right.length) {
            resultLength = left.length;
        } else {
            resultLength = right.length;
        }
        int[] result = new int[resultLength];
        int k = 0;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    result[k] = left[i];
                    k++;
                }
            }
        }
        result = Arrays.copyOf(result, k);
        return result;
    }
}