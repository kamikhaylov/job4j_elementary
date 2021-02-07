package ru.job4j.stream;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.stream.CollectorClass;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CollectorClassTest {

    @Test
    public void test() {
        Assert.assertEquals(
                List.of(1, 2, 3),
                CollectorClass.collect(List.of(1, 2, 3))
        );
    }
}