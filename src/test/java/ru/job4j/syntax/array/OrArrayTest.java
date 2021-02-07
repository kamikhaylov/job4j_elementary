package ru.job4j.syntax.array;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.syntax.array.OrArray;

import static org.junit.Assert.*;

public class OrArrayTest {

    @Test
    public void test1() {
        Assert.assertArrayEquals(new int[] {}, OrArray.or(new int[] {}, new int[] {}));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[] {1}, OrArray.or(new int[] {1}, new int[] {}));
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[] {1}, OrArray.or(new int[] {}, new int[] {1}));
    }

    @Test
    public void test4() {
        assertArrayEquals(new int[] {1, 2}, OrArray.or(new int[] {1, 2}, new int[] {1, 2}));

    }

    @Test
    public void test5() {
        assertArrayEquals(new int[] {1, 2, 3}, OrArray.or(new int[] {1, 2}, new int[] {1, 2, 3}));
    }

    @Test
    public void test6() {
        assertArrayEquals(new int[] {1, 2, 3}, OrArray.or(new int[] {1}, new int[] {2, 3}));
    }
}