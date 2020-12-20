package ru.job4j.collection.departments;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        if (o1.split("/")[0].compareTo(o2.split("/")[0]) != 0) {
            return o1.split("/")[0].compareTo(o2.split("/")[0]);
        }
        return o1.compareTo(o2);
    }
}