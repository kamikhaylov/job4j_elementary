package ru.job4j.syntax.array;

import static java.lang.Math.pow;

public class Square {
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < rst.length; i++) {
            rst[i] = (int) pow(i, 2);
        }
        return rst;
    }
}
