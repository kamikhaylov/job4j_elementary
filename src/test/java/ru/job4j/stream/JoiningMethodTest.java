package ru.job4j.stream;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.stream.JoiningMethod;

import java.util.List;
import java.util.StringJoiner;
import static org.junit.Assert.*;

public class JoiningMethodTest {

    @Test
    public void test() {
        StringJoiner expect = new StringJoiner(
                System.lineSeparator(),
                "Prefix",
                "Suffix"
        );
        expect.add("A");
        expect.add("B");
        expect.add("C");
        Assert.assertEquals(
                expect.toString(),
                JoiningMethod.join(List.of(
                        "A", "B", "C"
                ))
        );
    }
}