package ru.job4j.syntax.loop;

public class DegreeLoop {
    public static int calculate(int a, int n) {
        int result = a;
        for (int i = 1; i < n; i++) {
            result *= a;
        }
        return result;
    }
}
