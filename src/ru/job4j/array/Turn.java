package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int temp;
        int end = array.length - 1;
        for (int i = 0; i <= end / 2; i++) {
            temp = array[i];
            array[i] = array[end];
            array[end] = temp;
            end--;
        }
        return array;
    }
}
