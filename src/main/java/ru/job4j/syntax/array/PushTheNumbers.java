package ru.job4j.syntax.array;

public class PushTheNumbers {
    public static void push(int[][] array, int row, int column) {
        for (int i = 0; i < row; i++) {
            array[i][column] = array[i + 1][column];
        }
        for (int i = 0; i < array.length - row; i++) {
            array[array.length - 1 - i][column] = array[array.length - 2 - i][column];
        }
        for (int i = 0; i < column; i++) {
            array[row][i] = array[row][i + 1];
        }
        for (int i = 0; i < array.length - column; i++) {
            array[row][array.length - 1 - i] = array[row][array.length - 2 - i];
        }
        array[row][column] = 0;
    }
}