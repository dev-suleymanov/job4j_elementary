package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SquareTest {

    @Test
    public void when2() {
        int bound = 2;
        int[] arrayIn = {0, 1};
        int[] arrayOut = Square.calculate(bound);
        assertThat(arrayIn).isEqualTo(arrayOut);
    }

    @Test
    public void when4() {
        int bound = 4;
        int[] arrayIn = {0, 1, 4, 9};
        int[] arrayOut = Square.calculate(bound);
        assertThat(arrayIn).isEqualTo(arrayOut);
    }

    @Test
    public void when9() {
        int bound = 9;
        int[] arrayIn = {0, 1, 4, 9, 16, 25, 36, 49, 64};
        int[] arrayOut = Square.calculate(bound);
        assertThat(arrayIn).isEqualTo(arrayOut);
    }
}