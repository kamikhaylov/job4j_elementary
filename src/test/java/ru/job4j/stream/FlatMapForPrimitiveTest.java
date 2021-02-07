package ru.job4j.stream;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.stream.FlatMapForPrimitive;

import static org.junit.Assert.*;

public class FlatMapForPrimitiveTest {
    @Test
    public void test() {
        Assert.assertEquals(
                15,
                FlatMapForPrimitive.sum(new int[][] {
                        {1, 2, 3},
                        {4, 5}
                })
        );
    }
}