package ru.job4j.stream;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.stream.TakeWhileMethod;

import java.util.List;
import static org.junit.Assert.*;

public class TakeWhileMethodTest {
    @Test
    public void test() {
        Assert.assertEquals(
                List.of(-2, -1),
                TakeWhileMethod.takeWhile(List.of(3, 2, 1, 0, -2, -1))
        );
    }
}