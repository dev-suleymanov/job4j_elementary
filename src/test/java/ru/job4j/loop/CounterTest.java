package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CounterTest {

    @Test
    public void whenStart0Finish5Then15() {
        int start = 0;
        int finish = 5;
        int result = Counter.sum(start, finish);
        int expected = 15;
        assertThat(expected).isEqualTo(result);
    }

    @Test
    public void whenStart5Finish6Then11() {
        int start = 5;
        int finish = 6;
        int result = Counter.sum(start, finish);
        int expected = 11;
        assertThat(expected).isEqualTo(result);
    }

    @Test
    public void whenStart3Finish9Then42() {
        int start = 3;
        int finish = 9;
        int result = Counter.sum(start, finish);
        int expected = 42;
        assertThat(expected).isEqualTo(result);
    }

    @Test
    public void whenStart2Finish6Even12() {
        int start = 2;
        int finish = 6;
        int result = Counter.sumByEven(start, finish);
        int expected = 12;
        assertThat(expected).isEqualTo(result);
    }

    @Test
    public void whenStart10Finish14Even36() {
        int start = 10;
        int finish = 14;
        int result = Counter.sumByEven(start, finish);
        int expected = 36;
        assertThat(expected).isEqualTo(result);
    }
}