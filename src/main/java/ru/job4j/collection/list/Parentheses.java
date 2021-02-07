package ru.job4j.collection.list;

public class Parentheses {
    public static boolean valid(char[] data) {
        int balance = 0;
        if (data[0] == ')') {
            return false;
        }
        for (char c : data) {
            if (c == '(') {
                balance++;
            } else {
                balance--;
            }
        }
        return balance == 0;
    }
}