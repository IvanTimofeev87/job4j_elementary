package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import static org.junit.Assert.*;

public class ChessBoardTest {

    @Test
    public void When67to12then5() {
        int way = ChessBoard.way(6, 7, 1, 2);
        assertThat(way, is(5));
    }

    @Test
    public void When70to07then7() {
        int way = ChessBoard.way(7, 0, 0, 7);
        assertThat(way, is(7));
    }

    @Test
    public void When26to41then0() {
        int way = ChessBoard.way(2, 6, 4, 1);
        assertThat(way, is(0));
    }
}