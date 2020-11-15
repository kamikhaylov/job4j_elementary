package ru.job4j.syntax.loop;

public class OddCount {
    public static int count(int a, int b) {
        int result = 0;
        for (int i = a; i <= b; i++) {
            if ((i % 2) == 1) {
                result++;
            }
        }
        return result;
    }
}
