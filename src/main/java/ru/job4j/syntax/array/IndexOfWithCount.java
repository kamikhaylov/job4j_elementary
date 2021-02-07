package ru.job4j.syntax.array;

public class IndexOfWithCount {
    public static int indexOf(char[] string, char c, int number) {
        int result = -1;
        int coincidence = 1;
        for (int i = 0; i < string.length; i++) {
            if (string[i] == c) {
                if (coincidence == number) {
                    result = i;
                    break;
                } else {
                    coincidence++;
                }
            }
        }
        return result;
    }
}
