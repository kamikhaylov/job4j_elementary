package ru.job4j.syntax.array;

public class UnionThreeArrays {
    public static int[] union(int[] left, int[] middle, int[] right) {
        int[] result = new int[2 + middle.length / 2 + right.length / 2];
        result[0] = left[0];
        result[result.length - 1] = left[left.length - 1];

        int k = 2;
        for (int i = 1; i < middle.length; i += 2) {
            result[k] = middle[i];
            k += 2;
        }

        k = 1;
        for (int i = 0; i < right.length; i += 2) {
            result[k] = right[i];
            k += 2;
        }

        return result;
    }
}
