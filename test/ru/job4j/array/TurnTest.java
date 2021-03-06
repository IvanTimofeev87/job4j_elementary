package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TurnTest {

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2, 7, 8};
        int[] result = Turn.back(input);
        int[] expect = new int[] {8, 7, 2, 6, 1, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {1, 2, 3, 4, 5, 6, 7};
        int[] result = Turn.back(input);
        int[] expect = new int[] {7, 6, 5, 4, 3, 2, 1};
        assertThat(result, is(expect));
    }
}