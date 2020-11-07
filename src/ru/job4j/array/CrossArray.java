package ru.job4j.array;

public class CrossArray {
    public static void printCrossEl(int[] left, int[] right) {
        for (int i : left) {
            for (int j : right) {
                if (i == j) {
                    System.out.println(i);
                }
            }
        }
    }
}
