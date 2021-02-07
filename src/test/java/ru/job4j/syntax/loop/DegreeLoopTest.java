package ru.job4j.syntax.loop;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.syntax.loop.DegreeLoop;

import static org.junit.Assert.*;

public class DegreeLoopTest {

    @Test
    public void test() {
        Assert.assertEquals(4, DegreeLoop.calculate(2, 2));
        assertEquals(9, DegreeLoop.calculate(3, 2));
        assertEquals(3, DegreeLoop.calculate(3, 1));
        assertEquals(128, DegreeLoop.calculate(2, 7));
    }
}