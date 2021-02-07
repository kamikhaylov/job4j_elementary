package ru.job4j.collection.lambda;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.collection.lambda.FunctionPow;

import static org.junit.Assert.*;

public class FunctionPowTest {

    @Test
    public void test() {
        Assert.assertEquals(4, FunctionPow.calculate(2), 0.01);
        assertEquals(9, FunctionPow.calculate(3), 0.01);
    }

}