package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxNumberTest {

    @Test
    public void whenA10B18C25Then25() {
        int a = 10;
        int b = 18;
        int c = 2;
        int expected = 18;
        int result = MaxNumber.getMaxNumber(a, b, c);
        assertThat(result).isEqualTo(expected);
    }
}