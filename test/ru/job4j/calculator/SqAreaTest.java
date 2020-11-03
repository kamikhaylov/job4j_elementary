package ru.job4j.calculator;

import org.junit.Test;
import org.junit.Assert;
import ru.job4j.calculator.SqArea;

public class SqAreaTest {

    @Test
    public void square() {
        int expected = 2;
        int p = 6;
        int k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}