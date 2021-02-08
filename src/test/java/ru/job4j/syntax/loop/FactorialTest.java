package ru.job4j.syntax.loop;

import static org.hamcrest.MatcherAssert.assertThat;
import org.hamcrest.Matchers;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int rsl = Factorial.calc(5);
        int expected = 120;
        assertThat(rsl, Matchers.is(expected));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int rsl = Factorial.calc(0);
        int expected = 1;
        assertThat(rsl, Matchers.is(expected));
    }

    @Test
    public void whenCalculateFactorialForOneThenOne() {
        int rsl = Factorial.calc(1);
        int expected = 1;
        assertThat(rsl, Matchers.is(expected));
    }
}