package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];

        for (int i = 0; i < left.length; i++) {
            rsl[i] = left[i];
        }
        for (int i = 0; i < right.length; i++) {
            int indexRsl = rsl.length - 1 - i;
            int indexRight = right.length - 1 - i;
            rsl[indexRsl] = right[indexRight];
        }

        for (int i = 0; i < rsl.length; i++) {
            for (int j = i + 1; j < rsl.length; j++) {
                if (rsl[i] > rsl[j]) {
                    swap(rsl, i, j);
                }
            }
        }
        return rsl;
    }

    public static int[] swap(int[] array, int source, int dest) {
        int temp = array[dest];
        array[dest] = array[source];
        array[source] = temp;
        return array;
    }
}
