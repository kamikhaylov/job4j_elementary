package ru.job4j.stream;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.stream.BoxedMethod;

import java.util.List;
import static org.junit.Assert.*;

public class BoxedMethodTest {
    @Test
    public void test() {
        Assert.assertEquals(
                List.of(1, 2, 3),
                BoxedMethod.boxed(new int[] {1, 2, 3})
        );
    }
}