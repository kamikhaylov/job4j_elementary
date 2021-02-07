package ru.job4j.syntax.array;

public class RandomDream {
    public static String random(String[] prizes, int num) {
        if (num > 4) {
            num = num % 4;
            if (num == 0) {
                num = 4;
            }
        }
        return num > 0 ? prizes[num - 1] : prizes[num];
    }
}