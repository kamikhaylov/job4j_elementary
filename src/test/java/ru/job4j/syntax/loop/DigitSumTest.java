package ru.job4j.syntax.loop;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.syntax.loop.DigitSum;

import static org.junit.Assert.*;

public class DigitSumTest {
    @Test
    public void test() {
        Assert.assertEquals(1, DigitSum.sum(1));
        assertEquals(3, DigitSum.sum(12));
        assertEquals(6, DigitSum.sum(123));
        assertEquals(10, DigitSum.sum(1234));
        assertEquals(15, DigitSum.sum(12345));
    }
}