package ru.job4j.stream;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.stream.CountMethod;

import java.util.List;

import static org.junit.Assert.*;

public class CountMethodTest {

    @Test
    public void test() {
        Assert.assertEquals(3, CountMethod.count(List.of(1, 2, 3).stream()));
    }
}