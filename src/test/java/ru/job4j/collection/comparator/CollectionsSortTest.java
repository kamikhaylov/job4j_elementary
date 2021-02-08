package ru.job4j.collection.comparator;

import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class CollectionsSortTest {

    @Test
    public void test() {
        List<String> input = Arrays.asList("c", "b", "a");
        List<String> expect = List.of("a", "b", "c");
        List<String> out = CollectionsSort.sort(input);
        Assert.assertEquals(expect, out);
    }
}