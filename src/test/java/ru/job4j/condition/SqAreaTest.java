package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP2K1Square0dot25() {
        double expected = 0.25;
        int p = 2;
        double k = 1;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP9K6Square2dot47() {
        double expected = 2.47;
        int p = 9;
        double k = 6;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}