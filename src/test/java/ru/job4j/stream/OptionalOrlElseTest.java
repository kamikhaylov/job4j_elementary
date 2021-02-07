package ru.job4j.stream;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.stream.OptionalOrlElse;

import java.util.Optional;
import static org.junit.Assert.*;

public class OptionalOrlElseTest {

    @Test
    public void test() {
        Assert.assertEquals(Integer.valueOf(-1), OptionalOrlElse.orElse(Optional.empty()));
        assertEquals(Integer.valueOf(1), OptionalOrlElse.orElse(Optional.of(1)));
    }
}
