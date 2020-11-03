package ru.job4j.condition;

public class ArithmeticActions {
    public static String selectAction(int left, int right, int rsl) {
        String result = "none";
        if ((left + right) == rsl) {
            result = "added";
        }
        if ((left - right) == rsl) {
            result = "subtracted";
        }
        if ((left * right) == rsl) {
            result = "multiplied";
        }
        if ((left / right) == rsl) {
            result = "divided";
        }
        return result;
    }
}
