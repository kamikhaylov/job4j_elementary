package ru.job4j.syntax.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int three) {
        return three > max(left, right) ? three : max(left, right);
    }

    public static int max(int left, int right, int three, int four) {
        return four > max(left, right, three) ? three : max(left, right, three);
    }
}