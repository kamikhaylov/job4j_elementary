package ru.job4j.syntax.condition;

public class PairsCharString {
    public static boolean check(String l, String r) {
        if ((l.length() == 0) && (r.length() == 0)) {
            return true;
        }
        char oneL = l.charAt(0);
        char oneR = r.charAt(0);
        char lastL = l.charAt(l.length() - 1);
        char lastR = r.charAt(r.length() - 1);
        boolean result = false;

        if ((oneL == lastR) && (oneR == lastL)) {
            result = true;
        }
        return result;
    }
}
