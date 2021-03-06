package ru.job4j.syntax.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SymmetryTest {
    @Test
    public void checkTrue() {
        boolean check = Symmetry.check(1112111);
        assertThat(check, is(true));
    }

    @Test
    public void checkFalse() {
        boolean check = Symmetry.check(123456321);
        assertThat(check, is(false));
    }
}