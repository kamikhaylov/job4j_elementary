package ru.job4j.stream;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.stream.FilterString;

import java.util.List;
import static org.junit.Assert.*;

public class FilterStringTest {

    @Test
    public void test() {
        List<String> list = List.of("Abc.java", "abc.java", "Abc");
        Assert.assertEquals(List.of("Abc.java"), FilterString.filter(list));
    }
}