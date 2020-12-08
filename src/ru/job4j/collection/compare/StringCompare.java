package ru.job4j.collection.compare;

import java.util.Comparator;

import static java.lang.Math.min;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int leftLenght = left.length();
        int ringtLenght = right.length();
        int minLenght = min(leftLenght, ringtLenght);
        for (int i = 0; i < minLenght; i++) {
            int compare = Character.compare(left.charAt(i), right.charAt(i));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(leftLenght, ringtLenght);
    }
}
