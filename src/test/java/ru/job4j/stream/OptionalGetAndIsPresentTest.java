package ru.job4j.stream;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.stream.OptionalGetAndIsPresent;

import static org.junit.Assert.*;

public class OptionalGetAndIsPresentTest {

    @Test
    public void whenExist() {
        Assert.assertEquals(
                1,
                OptionalGetAndIsPresent.get(
                        new int[] {1, 2, 3},
                        2
                )
        );
    }

    @Test
    public void whenNotExist() {
        assertEquals(
                -1,
                OptionalGetAndIsPresent.get(
                        new int[] {1, 2, 3},
                        4
                )
        );
    }
}