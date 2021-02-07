package ru.job4j.stream;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.stream.FlatMapForObject;

import java.util.List;

import static org.junit.Assert.*;

public class FlatMapForObjectTest {
    @Test
    public void test() {
        Assert.assertEquals(
                List.of(1, 2, 3, 4),
                FlatMapForObject.flatMap(List.of(
                        List.of(1, 2),
                        List.of(3, 4)
                ))
        );
    }
}