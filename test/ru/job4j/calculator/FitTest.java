package ru.job4j.calculator;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenMan160Then69() {
        short in = 160;
        double expected = 69;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman160Then57() {
        short in = 160;
        double expected = 57.49;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}