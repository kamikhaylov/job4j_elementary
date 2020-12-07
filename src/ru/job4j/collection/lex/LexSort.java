package ru.job4j.collection.lex;

import java.util.Comparator;

import static java.lang.Integer.parseInt;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        Integer leftInt = parseInt(left.substring(0, left.indexOf('.')));
        Integer rightInt = parseInt(right.substring(0, right.indexOf('.')));
        return leftInt.compareTo(rightInt);
    }
}