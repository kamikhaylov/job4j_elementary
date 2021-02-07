package ru.job4j.collection.comparator;

import org.junit.Test;
import ru.job4j.collection.comparator.NullLastMethod;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class NullLastMethodTest {
    @Test
    public void test() {
        List<String> list = Arrays.asList("3", "2", "1", null);
        list.sort(NullLastMethod.nullLast());
        assertEquals(Arrays.asList("1", "2", "3", null), list);
    }
}