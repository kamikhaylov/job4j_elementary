package ru.job4j.syntax.array;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.syntax.array.IndexOfWithCount;

import static org.junit.Assert.*;

public class IndexOfWithCountTest {

    @Test
    public void whenNotContain() {
        Assert.assertEquals(-1, IndexOfWithCount.indexOf(
                new char[] {'a', 'b', 'c'},
                'd',
                1
        ));
    }

    @Test
    public void whenOrdinary() {
        assertEquals(3, IndexOfWithCount.indexOf(
                new char[] {'a', 'b', 'c', 'd'},
                'd',
                1
        ));
    }

    @Test
    public void whenByNumber() {
        assertEquals(6, IndexOfWithCount.indexOf(
                new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'd'},
                'd',
                2
        ));
    }
}