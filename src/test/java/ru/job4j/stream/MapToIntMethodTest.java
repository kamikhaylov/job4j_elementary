package ru.job4j.stream;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.stream.MapToIntMethod;

import java.util.List;
import static org.junit.Assert.*;

public class MapToIntMethodTest {
    @Test
    public void test() {
        Assert.assertEquals(294, MapToIntMethod.sum(List.of('a', 'b', 'c')));
    }
}