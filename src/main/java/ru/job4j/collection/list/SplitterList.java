package ru.job4j.collection.list;

import java.util.List;

public class SplitterList {
    public static List<String> splitList(List<String> left, List<String> middle, List<String> right) {
        left.removeAll(right);
        left.retainAll(middle);
        return left;
    }
}