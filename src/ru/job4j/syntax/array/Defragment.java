package ru.job4j.syntax.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index + 1;
                while (point < array.length && array[point] == null) {
                    point++;
                }
                if (point < array.length) {
                    swap(array, index, point);
                }
            }
        }
        return array;
    }

    public static String[] swap(String[] array, int nullIndex, int notNullIndex) {
        String temp = array[notNullIndex];
        array[notNullIndex] = array[nullIndex];
        array[nullIndex] = temp;
        return array;
    }
}