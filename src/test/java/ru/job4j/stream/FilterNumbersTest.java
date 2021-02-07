package ru.job4j.stream;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.stream.FilterNumbers;

import java.util.List;
import static org.junit.Assert.*;

public class FilterNumbersTest {
    @Test
    public void test() {
        Assert.assertEquals(List.of(2, 4), FilterNumbers.filter(List.of(1, 2, 3, 4)));
    }
}