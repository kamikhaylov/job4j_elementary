package ru.job4j.stream;

import org.junit.Before;
import org.junit.Test;
import java.util.*;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MatrixTest {
    private Integer[][] matrix;

    @Before
    public void setUp() {
        matrix = new Integer[][]{
                {1, 2},
                {3, 4}
        };
    }
    @Test
    public void whenMatrixToList() {
        Matrix m = new Matrix();
        List<Integer> rsl = m.collect(matrix);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4);
        assertThat(rsl, is(expected));
    }
}