package ru.job4j.syntax.loop;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.syntax.loop.OddCount;

import static org.junit.Assert.*;

public class OddCountTest {
    @Test
    public void test() {
        Assert.assertEquals(1, OddCount.count(1, 2));
        assertEquals(2, OddCount.count(1, 3));
        assertEquals(2, OddCount.count(1, 4));
        assertEquals(3, OddCount.count(1, 5));
    }
}