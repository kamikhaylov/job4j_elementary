package ru.job4j.syntax.array;

public class NoConsecutive {
    public static int find(int[] data) {
        int result = -1;
        for (int i = 1; i < data.length; i++) {
            if (Math.abs(data[i] - data[i - 1]) == 1) {
                result = -1;
            } else {
                result = data[i];
                break;
            }
        }
        return result;
    }
}