package ru.job4j.syntax.array;

import java.util.Arrays;

public class OrArray {
    public static int[] or(int[] left, int[] right) {
        if (left.length == 0 && right.length == 0) {
            return left;
        }

        if (left.length == 0) {
            return right;
        }

        if (right.length == 0) {
            return left;
        }

        int[] result = new int[left.length + right.length];
        int k = 0;
        int coincidence = 0;

        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (coincidence == 0 && left[i] != right[j]) {
                    result[k] = left[i];
                    coincidence++;
                    k++;
                }
            }
            coincidence = 0;
        }

        for (int i = 0; i < right.length; i++) {
            for (int j = 0; j < left.length; j++) {
                if (coincidence == 0 && right[i] != result[i]) {
                    result[k] = right[i];
                    k++;
                    coincidence++;
                }
            }
            coincidence = 0;
        }

        result = Arrays.copyOf(result, k);
        return result;
    }
}