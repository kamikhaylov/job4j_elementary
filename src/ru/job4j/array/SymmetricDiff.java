package ru.job4j.array;

import java.util.Arrays;

public class SymmetricDiff {
    public static int[] diff(int[] left, int[] right) {
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
        int unique = 0;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    unique++;
                }
            }
            if (unique == 0) {
                result[k] = left[i];
                k++;
            }
            unique = 0;
        }

        for (int i = 0; i < right.length; i++) {
            for (int j = 0; j < left.length; j++) {
                if (right[i] == left[j]) {
                    unique++;
                }
            }
            if (unique == 0) {
                result[k] = right[i];
                k++;
            }
            unique = 0;
        }

        result = Arrays.copyOf(result, k);
        return result;
    }
}