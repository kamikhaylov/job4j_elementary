package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SplitTest {
    @Test
    public void test() {
        assertArrayEquals(new String[] {"one", "two"}, convert(Split.split("one two".toCharArray(), ' ')));
    }

    @Test
    public void test1() {
        assertArrayEquals(new String[] {"one", "two", "three"}, convert(Split.split("one two three".toCharArray(), ' ')));
    }

    @Test
    public void test2() {
        assertArrayEquals(new String[] {"onetwothree"}, convert(Split.split("onetwothree".toCharArray(), ' ')));
    }

    @Test
    public void test3() {
        assertArrayEquals(new String[] {"12", "12", "12", "12", "12", "12", "12", "12"}, convert(Split.split("12 12 12 12 12 12 12 12".toCharArray(), ' ')));
    }

    private String[] convert(char[][] splitted) {
        String[] result = new String[splitted.length];
        int ri = 0;
        for (char[] row : splitted) {
            result[ri++] = new String(row);
        }
        return result;
    }
}