package ru.job4j.collection.departments;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] o1split = o1.split("/");
        String[] o2split = o2.split("/");
        int result = o2split[0].compareTo(o1split[0]);
        return result != 0 ? result : o1.compareTo(o2);
    }
}