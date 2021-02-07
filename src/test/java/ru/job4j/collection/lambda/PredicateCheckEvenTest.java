package ru.job4j.collection.lambda;

import org.junit.Test;
import ru.job4j.collection.lambda.PredicateCheckEven;

import static org.junit.Assert.*;

public class PredicateCheckEvenTest {

    @Test
    public void test() {
        assertTrue(PredicateCheckEven.check(2));
        assertFalse(PredicateCheckEven.check(1));
    }
}