package ru.job4j.syntax.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int three) {
        return max(max(left, right), three);
    }

    public static int max(int left, int right, int three, int four) {
        return max(max(left, right, three), four);
    }
}