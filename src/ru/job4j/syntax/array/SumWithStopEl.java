package ru.job4j.syntax.array;

public class SumWithStopEl {
    public static int count(int[] data, int el) {
        int result = 0;
        for (int i : data) {
            result += i;
            if (el == i) {
                if ((result % 2) == 0) {
                    result = 0;
                    break;
                } else {
                    result -= i;
                    break;
                }
            }
        }
        return result;
    }
}
