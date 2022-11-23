package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point first = new Point(0, 0);
        Point second = new Point(2, 0);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when12to35then3dot6() {
        double expected = 3.6;
        Point first = new Point(1, 2);
        Point second = new Point(3, 5);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when26to79then5dot83() {
        double expected = 5.83;
        Point first = new Point(2, 6);
        Point second = new Point(7, 9);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }
}