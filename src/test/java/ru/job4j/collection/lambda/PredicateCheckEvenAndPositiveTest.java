package ru.job4j.collection.lambda;

import org.junit.Test;
import ru.job4j.collection.lambda.PredicateCheckEvenAndPositive;

import static org.junit.Assert.*;

public class PredicateCheckEvenAndPositiveTest {

    @Test
    public void test() {
        assertTrue(PredicateCheckEvenAndPositive.check(2));
        assertFalse(PredicateCheckEvenAndPositive.check(-2));
        assertFalse(PredicateCheckEvenAndPositive.check(1));
    }
}