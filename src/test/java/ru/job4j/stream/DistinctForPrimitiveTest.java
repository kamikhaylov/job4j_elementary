package ru.job4j.stream;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.stream.DistinctForPrimitive;

import java.util.List;
import static org.junit.Assert.*;

public class DistinctForPrimitiveTest {

    @Test
    public void test() {
        Assert.assertEquals(
                List.of(1, 2, 3),
                DistinctForPrimitive.collect(new int[] {1, 2, 3, 1, 2, 3})
        );
    }
}