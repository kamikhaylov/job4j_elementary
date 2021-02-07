package ru.job4j.stream;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.stream.CharsMethod;

import java.util.List;
import static org.junit.Assert.*;

public class CharsMethodTest {
    @Test
    public void test() {
        String input = "123";
        List<Character> expect = List.of('1', '2', '3');
        Assert.assertEquals(expect, CharsMethod.symbols(input));
    }
}