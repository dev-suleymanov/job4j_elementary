package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MultipleSwitchWeekTest {

    @Test
    public void whenNameWednesdayThen1() {
        String name = "Wednesday";
        int expected = 3;
        int day = MultipleSwitchWeek.numberOfDay(name);
        assertThat(expected).isEqualTo(day);
    }

    @Test
    public void whenNameSaturdayThen6() {
        String name = "Saturday";
        int expected = 6;
        int day = MultipleSwitchWeek.numberOfDay(name);
        assertThat(expected).isEqualTo(day);
    }
}