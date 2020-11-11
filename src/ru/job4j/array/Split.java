package ru.job4j.array;

import java.util.Arrays;

public class Split {
    public static char[][] split(char[] str, char c) {
        char[][] result = new char[str.length][];
        int commonCount = 0;
        int t = 0;

        for (int i = 0; i < str.length; i++) {
            result[i] = new char[str.length];
        }

        for (int i = 0; i < str.length; i++) {
            if (str[i] == c) {
                result[commonCount] = Arrays.copyOf(result[commonCount], t);
                i++;
                t = 0;
                commonCount++;
            }
            result[commonCount][t] = str[i];
            t++;
        }

        result[commonCount] = Arrays.copyOf(result[commonCount], t);

        return Arrays.copyOf(result, commonCount + 1);
    }
}