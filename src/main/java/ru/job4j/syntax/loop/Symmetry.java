package ru.job4j.syntax.loop;

public class Symmetry {
    public static boolean check(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i));
        int k = sb.length() - 1;
        for (int j = 0; j < sb.length() / 2; j++) {
            if (sb.charAt(j) != sb.charAt(k)) {
                return false;
            }
            k--;
        }
        return true;
    }
}