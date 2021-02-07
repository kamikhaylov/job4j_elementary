package ru.job4j.collection.list;

import java.util.List;

public class AddAllElementsList {
    public static int containsElement(List<String> left, List<String> right, String str) {
        boolean checkLeft = false;
        boolean checkRight = false;
        int index = 0;
        for (int i = 0; i < left.size(); i++) {
            if (left.get(i).equals(str)) {
                index = i;
                checkLeft = true;
                break;
            }
        }
        for (int i = 0; i < right.size(); i++) {
            if (right.get(i).equals(str)) {
                checkRight = true;
                break;
            }
        }
        if (checkLeft && checkRight) {
            left.remove(index);
            left.addAll(right);
        }
        return left.indexOf(str);
    }
}