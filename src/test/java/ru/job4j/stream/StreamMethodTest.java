package ru.job4j.stream;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.stream.StreamMethod;

import java.util.List;
import static org.junit.Assert.*;

public class StreamMethodTest {
    @Test
    public void whenUserStreamMethod() {
        Assert.assertEquals(3, StreamMethod.createStream(
                List.of(1, 2, 3)
        ).count());
    }
}