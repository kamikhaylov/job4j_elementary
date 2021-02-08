package ru.job4j.syntax.calculator;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class GameTest {
    @Test
    public void checkGame() {
        int rsl = Game.checkGame(0.2, 50, 9);
        assertThat(rsl, is(1));
    }

    @Test
    public void checkGameIs0() {
        int rsl = Game.checkGame(0.9, 1, 2);
        assertThat(rsl, is(0));
    }
}