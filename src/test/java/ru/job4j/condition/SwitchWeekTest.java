package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SwitchWeekTest {

    @Test
    public void whenDay5ThenNameFriday() {
        int day = 5;
        String expected = "Friday";
        String name = SwitchWeek.nameOfDay(day);
        assertThat(expected).isEqualTo(name);
    }

    @Test
    public void whenDay0ThenNameError() {
        int day = 0;
        String expected = "Error";
        String name = SwitchWeek.nameOfDay(day);
        assertThat(expected).isEqualTo(name);
    }

    @Test
    public void whenDay7ThenNameSunday() {
        int day = 7;
        String expected = "Sunday";
        String name = SwitchWeek.nameOfDay(day);
        assertThat(expected).isEqualTo(name);
    }
}