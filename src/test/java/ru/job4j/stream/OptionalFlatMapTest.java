package ru.job4j.stream;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.stream.OptionalFlatMap;

import java.util.List;
import java.util.Optional;
import static org.junit.Assert.*;

public class OptionalFlatMapTest {

    @Test
    public void whenExist() {
        Assert.assertEquals(
                Optional.of("Hello.java".length()),
                OptionalFlatMap.flatMap(
                        List.of("Hello.java", "Hello.js", "Hello.py")
                )
        );
    }

    @Test
    public void whenNotExist() {
        assertEquals(
                Optional.empty(),
                OptionalFlatMap.flatMap(
                        List.of("Hello.cpp", "Hello.js", "Hello.py")
                )
        );
    }
}