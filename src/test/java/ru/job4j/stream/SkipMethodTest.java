package ru.job4j.stream;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.stream.SkipMethod;

import java.util.List;
import static org.junit.Assert.*;

public class SkipMethodTest {
    @Test
    public void test() {
        Assert.assertEquals(
                List.of("C", "D", "E"),
                SkipMethod.lastThree(List.of("A", "B", "C", "D", "E"))
        );
    }
}