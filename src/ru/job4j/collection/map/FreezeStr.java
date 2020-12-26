package ru.job4j.collection.map;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        for (String s : left.split("")) {
            right = right.replaceFirst(s, "");
        }
        return right.length() == 0;
    }
}
