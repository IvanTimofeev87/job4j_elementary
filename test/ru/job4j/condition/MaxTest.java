package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax7To4Then2() {
        int firstNum = 7;
        int secondNum = 4;
        int expected = 7;
        int result = Max.max(firstNum, secondNum);
        assertThat(result, is(expected));
    }

    @Test
    public void whenMax3To9Then9() {
        int firstNum = 3;
        int secondNum = 9;
        int expected = 9;
        int result = Max.max(firstNum, secondNum);
        assertThat(result, is(expected));
    }

    @Test
    public void whenMax5To5Then5() {
        int firstNum = 5;
        int secondNum = 5;
        int expected = firstNum;
        int result = Max.max(firstNum, secondNum);
        assertThat(result, is(expected));
    }
}