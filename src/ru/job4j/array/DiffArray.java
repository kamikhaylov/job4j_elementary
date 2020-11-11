package ru.job4j.array;

import java.util.Arrays;

public class DiffArray {
    public static int[] diff(int[] left, int[] right) {
        if ((left.length == 0 && right.length == 0) || (left.length == 0 || right.length == 0)) {
            return left;
        }

        int[] result = new int[left.length];
        int k = 0;
        int unique = 0;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (unique == 0 && left[i] != right[j]) {
                    result[k] = left[i];
                    k++;
                    unique++;
                }
            }
            unique = 0;
        }
        result = Arrays.copyOf(result, k);
        return result;
    }
}
