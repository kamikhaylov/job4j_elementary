package ru.job4j.collection.comparator;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.collection.comparator.ReverseOrder;

import java.util.Comparator;

import static org.junit.Assert.*;

public class ReverseOrderTest {

    @Test
    public void test() {
        Assert.assertEquals(Comparator.reverseOrder(), ReverseOrder.reverseOrder());
    }
}