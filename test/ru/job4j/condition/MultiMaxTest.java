package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {

    @Test
    public void when1And4And2Then4() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void when9And4And2Then9() {
        int result = MultiMax.max(9, 4, 2);
        assertThat(result, is(9));
    }

    @Test
    public void when1And6And2Then6() {
        int result = MultiMax.max(1, 6, 2);
        assertThat(result, is(6));
    }

    @Test
    public void when1And4And8Then8() {
        int result = MultiMax.max(1, 4, 8);
        assertThat(result, is(8));
    }

    @Test
    public void when8And8And8Then8() {
        int result = MultiMax.max(8, 8, 8);
        assertThat(result, is(8));
    }
}