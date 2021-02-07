package ru.job4j.syntax.array;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.syntax.array.UpperCase;

import static org.junit.Assert.*;

public class UpperCaseTest {
    @Test
    public void test() {
        char[] input = "alpha-123".toCharArray();
        char[] expect = "ALPHA-123".toCharArray();
        Assert.assertArrayEquals(expect, UpperCase.toUpperCase(input));
    }
}