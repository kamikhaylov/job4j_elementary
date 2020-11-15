package ru.job4j.syntax.array;

public class MaxLengthSeria {
    public static int find(int[] array) {
        int maxSeria = 1;
        int temp = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] >= array[i]) {
                temp++;
                maxSeria = temp;
            } else {
                temp = 1;
            }
        }
        return maxSeria;
    }
}