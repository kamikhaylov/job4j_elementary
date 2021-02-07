package ru.job4j.stream;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.stream.Task1;

import java.util.List;
import static org.junit.Assert.*;

public class Task1Test {
    @Test
    public void test() {
        Assert.assertEquals(List.of(1, 2, 3), Task1.retain(List.of(1, 2, 3)));
        assertEquals(List.of(1, 2, 3), Task1.retain(List.of(1, 2, 3, 4)));
        assertEquals(List.of(1, 2, 3, 5), Task1.retain(List.of(1, 2, 3, 4, 5, 8)));
        assertEquals(List.of(), Task1.retain(List.of(4, 8)));
        assertEquals(List.of(), Task1.retain(List.of()));
    }
}