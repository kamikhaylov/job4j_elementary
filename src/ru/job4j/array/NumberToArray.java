package ru.job4j.array;

public class NumberToArray {
    public static int[] resolve(int number) {
        int[] result = new int[String.valueOf(Math.abs(number)).length()];
        int temp = number;
        for (int i = 0; i < result.length; i++) {
            temp = number % 10;
            result[i] = temp;
            number = number / 10;
        }
        return result;
    }
}
