package ru.job4j.stream;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.stream.LimitMethod;

import java.util.List;
import static org.junit.Assert.*;

public class LimitMethodTest {

    @Test
    public void test() {
        Assert.assertEquals(
                List.of("A", "B", "C"),
                LimitMethod.firstThree(List.of("A", "B", "C", "D", "E"))
        );
    }
}