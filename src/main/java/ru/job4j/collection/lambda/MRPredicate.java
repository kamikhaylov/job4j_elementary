package ru.job4j.collection.lambda;

import java.util.function.Predicate;

public class MRPredicate {
    public static Predicate<String> predicate() {
        return String::isEmpty;
    }
}