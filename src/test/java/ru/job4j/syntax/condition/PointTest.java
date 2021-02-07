package ru.job4j.syntax.condition;

import org.junit.Test;
import org.junit.Assert;
import ru.job4j.syntax.condition.Point;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        int expected = 2;
        double out = a.distance(b);

        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when12to20then2() {
        Point a = new Point(1, 2);
        Point b = new Point(2, 0);
        int expected = 2;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.24);
    }

    @Test
    public void when24to28then2() {
        Point a = new Point(2, 4);
        Point b = new Point(2, 8);
        int expected = 4;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when123to345then3() {
        Point a = new Point(1, 2, 3);
        Point b = new Point(3, 4, 5);
        int expected = 3;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.2);
    }
}