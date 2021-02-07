package ru.job4j.syntax.array;

import org.junit.Test;
import ru.job4j.syntax.array.SwitchArray;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap2to7() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] expect = {1, 2, 8, 4, 5, 6, 7, 3, 9};
        int[] rsl = SwitchArray.swap(input, 2, 7);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwapBorder() {
        int[] input = new int[] {1, 2, 3, 4, 5, 6};
        int[] expect = new int[] {6, 2, 3, 4, 5, 1};
        int[] rsl = SwitchArray.swapBorder(input);
        assertThat(rsl, is(expect));
    }
}