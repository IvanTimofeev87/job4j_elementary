package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;
public class PointTest {

    @Test
    public void when43to78then() {
        double expected = 5.83;
        int x1 = 4;
        int y1 = 3;
        int x2 = 7;
        int y2 = 8;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when24to48then() {
        double expected = 4.47;
        int x1 = 2;
        int y1 = 4;
        int x2 = 4;
        int y2 = 8;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when36to69then() {
        double expected = 4.24;
        int x1 = 3;
        int y1 = 6;
        int x2 = 6;
        int y2 = 9;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}