package ru.job4j.syntax.array;

public class SummingPrevious {
    public static int[] calculate(int a, int b, int n) {
        int[] result = new int[n];
        result[0] = a;
        result[1] = b;
        for (int i = 2; i < n; i++) {
            for (int j = 0; j < i; j++) {
                result[i] += result[j];
            }
        }
        return result;
    }
}
