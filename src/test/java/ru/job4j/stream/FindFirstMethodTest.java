package ru.job4j.stream;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.stream.FindFirstMethod;

import java.util.List;
import java.util.Optional;
import static org.junit.Assert.*;

public class FindFirstMethodTest {

    @Test
    public void test() {
        Assert.assertEquals(Optional.empty(), FindFirstMethod.first(List.of()));
        assertEquals(Optional.of(1), FindFirstMethod.first(List.of(1)));
    }
}