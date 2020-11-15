package ru.job4j.syntax.calculator;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenp4k1s1() {
        int k = 1;
        int p = 4;
        int expected = 1;
        int s = (int) SqArea.square(p, k);
        assertThat(s, is(expected));
    }

    @Test
    public void whenp6k2s2() {
        int k = 2;
        int p = 6;
        int expected = 2;
        int s = (int) SqArea.square(p, k);
        assertThat(s, is(expected));
    }

    @Test
    public void square() {
        int expected = 2;
        int p = 6;
        int k = 2;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }
}