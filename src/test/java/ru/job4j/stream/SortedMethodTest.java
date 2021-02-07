package ru.job4j.stream;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.stream.SortedMethod;

import java.util.List;
import static org.junit.Assert.*;

public class SortedMethodTest {
    @Test
    public void test() {
        Assert.assertEquals(
                List.of("a", "b", "c"),
                SortedMethod.sorted(List.of("c", "b", "a"))
        );
    }
}