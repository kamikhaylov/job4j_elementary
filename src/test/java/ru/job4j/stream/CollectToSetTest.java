package ru.job4j.stream;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.stream.CollectToSet;

import java.util.Set;
import static org.junit.Assert.assertEquals;

public class CollectToSetTest {
    @Test
    public void test() {
        Set<Integer> input = Set.of(1, 2);
        Set<Integer> expect = Set.of(1, 2);
        Assert.assertEquals(expect, CollectToSet.collect(input.stream()));
    }
}