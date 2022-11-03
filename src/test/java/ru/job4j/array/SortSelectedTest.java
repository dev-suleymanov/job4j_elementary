package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void when3Sort() {
        int[] data = new int[]{12, 11, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{5, 11, 12};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void when5Sort() {
        int[] data = new int[]{1, 4, 3, 6, 9};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 3, 4, 6, 9};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void when7Sort() {
        int[] data = new int[]{4, 1, 6, 10, 1, 2, 10};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 1, 2, 4, 6, 10, 10};
        assertThat(result).containsExactly(expected);
    }
}