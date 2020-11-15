package ru.job4j.syntax.loop;

public class Abbreviation {
    public static String collect(String s) {
        StringBuilder sb = new StringBuilder(s);
        String abbreviation =  sb.substring(0, 1);
        for (int i = 1; i < sb.length(); i++) {
            if (sb.charAt(i) == ' ') {
                abbreviation += sb.substring(i + 1, i + 2);
            }
        }
        return abbreviation;
    }
}
