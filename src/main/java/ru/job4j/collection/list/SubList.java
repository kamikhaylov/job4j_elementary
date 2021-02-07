package ru.job4j.collection.list;

import java.util.List;

public class SubList {
    public static List<String> getElementsBetweenIndexes(List<String> list, String el) {
        int fromIndex = 0;
        int toIndex = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(el)) {
                fromIndex = i;
                toIndex = i;
                break;
            }
        }
        for (int i = fromIndex + 1; i < list.size(); i++) {
            if (list.get(i).equals(el)) {
                toIndex = i;
                break;
            }
        }
        return list.subList(fromIndex, toIndex);
    }
}