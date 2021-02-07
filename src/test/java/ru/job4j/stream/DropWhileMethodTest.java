package ru.job4j.stream;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.stream.DropWhileMethod;

import java.util.List;
import static org.junit.Assert.*;

public class DropWhileMethodTest {
    @Test
    public void test() {
        Assert.assertEquals(
                List.of(1, 2, 3),
                DropWhileMethod.dropWhile(List.of(3, 2, 1, -1, -2))
        );
    }
}