package ru.job4j.stream;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.stream.CollectToList;

import java.util.List;
import static org.junit.Assert.*;

public class CollectToListTest {
    @Test
    public void test() {
        List<Integer> input = List.of(1, 2);
        List<Integer> expect = List.of(1, 2);
        Assert.assertEquals(expect, CollectToList.collect(input.stream()));
    }
}