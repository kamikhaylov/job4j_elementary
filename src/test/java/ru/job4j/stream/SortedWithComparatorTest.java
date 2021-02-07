package ru.job4j.stream;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.stream.SortedWithComparator;

import java.util.List;
import static org.junit.Assert.*;

public class SortedWithComparatorTest {
    @Test
    public void test() {
        Assert.assertEquals(
                List.of("c", "b", "a"),
                SortedWithComparator.sorted(List.of("a", "b", "c"))
        );
    }
}