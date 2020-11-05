package ru.job4j.loop;

public class Cryptography {
    public static String code(String s) {
        String result = "empty";
        StringBuilder sb = new StringBuilder(s);
        if (s.equals("")) {
            return result;
        }
        if ((s.length() > 0) && (s.length() <= 4)) {
            return s;
        }

        for (int i = 0; i < sb.length() - 4; i++) {
            sb.setCharAt(i, '#');
        }
        result = sb.toString();
        return result;
    }
}